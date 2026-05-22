package com.querycache.service;

import com.querycache.cache.QueryPlanCache;
import com.querycache.metrics.CacheMetrics;
import com.querycache.model.QueryPlan;
import com.querycache.parser.SQLiteParserService;

import java.util.UUID;

/**
 * QueryService - NO CHANGES REQUIRED!
 * 
 * This class works exactly as before. The cache internally uses hash keys,
 * but the service layer doesn't need to know about this optimization.
 */
public class QueryService {
    
    private final QueryPlanCache cache;
    private final CacheMetrics metrics;
    private final SQLiteParserService parserService;
    private boolean lastAccessWasHit = false;
    
    private static final int PLAN_GEN_BASE_TIME = 45;
    
    public QueryService() {
        this.cache = new QueryPlanCache();
        this.metrics = new CacheMetrics();
        this.parserService = new SQLiteParserService();
        parserService.setDebug(true);
    }
    
    public void setCacheEnabled(boolean enabled) {
        cache.setEnabled(enabled);
    }
    
    public void clearCache() {
        cache.clear();
        metrics.reset();
    }
    
    public void notifySchemaChange(String tableName) {
        cache.notifySchemaChange(tableName);
    }
    
    public boolean getLastAccessWasHit() {
        return lastAccessWasHit;
    }
    
    public QueryPlanCache getCache() {
        return cache;
    }
    
    public CacheMetrics getMetrics() {
        return metrics;
    }
    
    public QueryPlan execute(String query) {
        if (!parserService.validateQuery(query)) {
            throw new IllegalArgumentException("Invalid SQL syntax: " + query);
        }
        
        long startTime = System.currentTimeMillis();
        
        String normalizedQuery = parserService.normalizeQuery(query);
        QueryPlan plan = cache.get(normalizedQuery);
        
        if (plan != null && cache.isValid(normalizedQuery, plan)) {
            lastAccessWasHit = true;
            plan.incrementAccessCount();
            long executionTime = System.currentTimeMillis() - startTime;
            metrics.recordHit(executionTime);
            plan.setLastExecutionTime(executionTime);
            return plan;
        }
        
        lastAccessWasHit = false;
        
        if (plan != null && !cache.isValid(normalizedQuery, plan)) {
            cache.evict(normalizedQuery);
        }
        
        try {
            Thread.sleep(PLAN_GEN_BASE_TIME + (int)(Math.random() * 20));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        String planId = UUID.randomUUID().toString();
        plan = new QueryPlan(planId, normalizedQuery);
        
        extractTables(query, plan);
        cache.put(normalizedQuery, plan);
        
        long executionTime = System.currentTimeMillis() - startTime;
        metrics.recordMiss(executionTime);
        plan.setLastExecutionTime(executionTime);
        
        return plan;
    }
    
    private void extractTables(String query, QueryPlan plan) {
        String lowerQuery = query.toLowerCase();
        if (lowerQuery.contains("orders")) plan.addTableAccessed("orders");
        if (lowerQuery.contains("products")) plan.addTableAccessed("products");
        if (lowerQuery.contains("users")) plan.addTableAccessed("users");
        if (lowerQuery.contains("customers")) plan.addTableAccessed("customers");
    }
}