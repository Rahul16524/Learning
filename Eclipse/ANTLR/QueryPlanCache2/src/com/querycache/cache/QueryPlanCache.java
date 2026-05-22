package com.querycache.cache;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.querycache.model.QueryPlan;
import com.querycache.util.QueryHashUtil;                                    // NEW: Import hash utility

/**
 * QueryPlanCache - Optimized with hash-based keys
 * 
 * CHANGES MADE IN THIS FILE:
 * 1. Added hashToQueryMap for reverse lookup (debugging)
 * 2. Modified get() to use SHA-256 hash as key instead of full query string
 * 3. Modified put() to store using hash key
 * 4. Modified evict() to use hash key for removal
 * 5. Modified clear() to also clear debug map
 * 6. Modified invalidateForTable() to clean debug map
 * 7. Added printCacheContents() for debugging
 * 
 * Reason for changes: Replace long query strings (200+ chars) with 
 * fixed-size hash keys (64 chars) for better memory and speed.
 * 
 * @author QueryCache Team
 * @version 2.0
 */
public class QueryPlanCache {
    
    // ===================== DATA STRUCTURES =====================

    // Main cache: Stores (Hash → QueryPlan)                          // CHANGED: Now uses hash as key
    private final Map<String, QueryPlan> cache;
    
    // Reverse lookup: Hash → NormalizedQuery (for debugging only)    // NEW: Debug mapping
    private final Map<String, String> hashToQueryMap;
    
    // Tracks last access time → used for LRU eviction
    private final Map<String, Long> accessTimestamps;
    
    // Tracks schema version for each table
    private final Map<String, Integer> schemaVersions;
    
    private final int maxSize;
    private boolean enabled = true;
    
    
    // ===================== CONSTRUCTORS =====================

    public QueryPlanCache() {
        this(100);
    }
    
    public QueryPlanCache(int maxSize) {
        this.cache = new ConcurrentHashMap<>();                          // UNCHANGED
        this.hashToQueryMap = new ConcurrentHashMap<>();                 // NEW: Initialize debug map
        this.accessTimestamps = new ConcurrentHashMap<>();               // UNCHANGED
        this.schemaVersions = new ConcurrentHashMap<>();                 // UNCHANGED
        this.maxSize = maxSize;                                          // UNCHANGED
    }
    
    
    // ===================== CACHE CONTROL =====================

    public void setEnabled(boolean enabled) {                            // UNCHANGED
        this.enabled = enabled;
        System.out.println("⚙️ Cache " + (enabled ? "ENABLED" : "DISABLED"));
    }

    public boolean isEnabled() {                                         // UNCHANGED
        return enabled;
    }
    
    
    // ===================== GET (READ FROM CACHE) =====================

    /**
     * Get query plan from cache using hash of normalized query
     * 
     * CHANGES IN THIS METHOD:
     * - Added hashKey generation using QueryHashUtil.hashQuery()
     * - Now uses hashKey instead of normalizedQuery for cache lookup
     * 
     * @param normalizedQuery The normalized query string
     * @return QueryPlan if found, null otherwise
     */
    public QueryPlan get(String normalizedQuery) {
        if (!enabled) return null;                                       // UNCHANGED
        
        String hashKey = QueryHashUtil.hashQuery(normalizedQuery);       // NEW: Generate hash key
        QueryPlan plan = cache.get(hashKey);                             // CHANGED: Use hash key instead of normalizedQuery
        
        if (plan != null) {
            accessTimestamps.put(hashKey, System.currentTimeMillis());   // CHANGED: Use hash key
        }
        
        return plan;                                                     // UNCHANGED
    }
    
    
    // ===================== PUT (STORE IN CACHE) =====================

    /**
     * Store a new query plan using hash-based key
     * 
     * CHANGES IN THIS METHOD:
     * - Added hashKey generation
     * - Store using hashKey instead of normalizedQuery
     * - Store reverse mapping in hashToQueryMap for debugging
     * 
     * @param normalizedQuery The normalized query string
     * @param plan The query plan to store
     */
    public void put(String normalizedQuery, QueryPlan plan) {
        if (!enabled) return;                                            // UNCHANGED
        
        String hashKey = QueryHashUtil.hashQuery(normalizedQuery);       // NEW: Generate hash key
        
        if (cache.size() >= maxSize) {                                   // UNCHANGED
            evictLRU();
        }
        
        int version = getCurrentSchemaVersion(plan.getTablesAccessed()); // UNCHANGED
        plan.setSchemaVersion(version);                                  // UNCHANGED
        
        cache.put(hashKey, plan);                                        // CHANGED: Use hash key instead of normalizedQuery
        hashToQueryMap.put(hashKey, normalizedQuery);                    // NEW: Store reverse mapping for debugging
        accessTimestamps.put(hashKey, System.currentTimeMillis());       // CHANGED: Use hash key
    }
    
    
    // ===================== SCHEMA INVALIDATION =====================

    /**
     * Called when table schema changes (ALTER TABLE)
     * 
     * CHANGES IN THIS METHOD:
     * - Added removal from hashToQueryMap when invalidating plans
     * 
     * @param tableName Name of the table that changed
     */
    public void invalidateForTable(String tableName) {
        if (!enabled) return;
        
        int newVersion = schemaVersions.getOrDefault(tableName, 0) + 1;
        schemaVersions.put(tableName, newVersion);
        
        int removedCount = 0;
        
        Iterator<Map.Entry<String, QueryPlan>> iterator = cache.entrySet().iterator();
        
        while (iterator.hasNext()) {
            Map.Entry<String, QueryPlan> entry = iterator.next();
            
            if (entry.getValue().getTablesAccessed().contains(tableName)) {
                iterator.remove();
                hashToQueryMap.remove(entry.getKey());                   // NEW: Remove from debug map
                accessTimestamps.remove(entry.getKey());
                removedCount++;
            }
        }
        
        System.out.println("🗑️ Invalidated " + removedCount + " plans for table: " + tableName);
    }

    public void notifySchemaChange(String tableName) {                   // UNCHANGED
        invalidateForTable(tableName);
    }
    
    
    // ===================== CLEAR / REMOVE =====================

    /**
     * Clear entire cache
     * 
     * CHANGES IN THIS METHOD:
     * - Added clearing of hashToQueryMap
     */
    public void clear() {
        cache.clear();                                                   // UNCHANGED
        hashToQueryMap.clear();                                          // NEW: Clear debug map
        accessTimestamps.clear();                                        // UNCHANGED
        System.out.println("🗑️ Cache cleared completely");
    }

    /**
     * Remove a specific query plan using hash key
     * 
     * CHANGES IN THIS METHOD:
     * - Generate hash key from normalizedQuery
     * - Remove from hashToQueryMap as well
     * 
     * @param normalizedQuery The normalized query to evict
     */
    public void evict(String normalizedQuery) {
        String hashKey = QueryHashUtil.hashQuery(normalizedQuery);       // NEW: Generate hash key
        if (cache.remove(hashKey) != null) {                             // CHANGED: Use hash key
            hashToQueryMap.remove(hashKey);                              // NEW: Remove from debug map
            accessTimestamps.remove(hashKey);                            // CHANGED: Use hash key
            System.out.println("🗑️ Removed invalid plan: " + normalizedQuery);
        }
    }
    
    
    // ===================== LRU EVICTION =====================

    /**
     * Remove Least Recently Used query (UNCHANGED logic)
     * Only the key type changed from query string to hash
     */
    private void evictLRU() {
        if (cache.isEmpty()) return;
        
        String oldestKey = null;
        long oldestTime = Long.MAX_VALUE;
        
        for (Map.Entry<String, Long> entry : accessTimestamps.entrySet()) {
            if (entry.getValue() < oldestTime) {
                oldestTime = entry.getValue();
                oldestKey = entry.getKey();
            }
        }
        
        if (oldestKey != null) {
            cache.remove(oldestKey);
            hashToQueryMap.remove(oldestKey);                            // NEW: Remove from debug map
            accessTimestamps.remove(oldestKey);
            System.out.println("🗑️ LRU removed: " + oldestKey);
        }
    }
    
    
    // ===================== SCHEMA VERSION LOGIC =====================

    private int getCurrentSchemaVersion(java.util.List<String> tables) { // UNCHANGED
        int maxVersion = 0;
        for (String table : tables) {
            int version = schemaVersions.getOrDefault(table, 0);
            maxVersion = Math.max(maxVersion, version);
        }
        return maxVersion;
    }

    /**
     * Check if plan is still valid (UNCHANGED logic)
     * 
     * @param normalizedQuery The normalized query (used for consistency but not in hash version)
     * @param plan The plan to validate
     * @return true if plan is still valid
     */
    public boolean isValid(String normalizedQuery, QueryPlan plan) {    // UNCHANGED logic
        if (!enabled) return false;
        int currentVersion = getCurrentSchemaVersion(plan.getTablesAccessed());
        return plan.getSchemaVersion() == currentVersion;
    }
    
    
    // ===================== UTILITY =====================
    
    public int getSize() {                                               // UNCHANGED
        return cache.size();
    }
    
    /**
     * Debug method to print cache contents                             // NEW: Debug method
     * Shows mapping from hash to original normalized query
     */
    public void printCacheContents() {
        System.out.println("\n📦 Cache Contents (Hash → Normalized Query):");
        System.out.println("─".repeat(80));
        for (Map.Entry<String, String> entry : hashToQueryMap.entrySet()) {
            String hashShort = entry.getKey().substring(0, 16) + "...";
            String queryShort = entry.getValue().length() > 50 ? 
                                entry.getValue().substring(0, 47) + "..." : 
                                entry.getValue();
            System.out.printf("  %s → %s%n", hashShort, queryShort);
        }
    }
}