package com.querycache.service;

import com.querycache.cache.QueryPlanCache;
import com.querycache.model.QueryPlan;
import com.querycache.parser.QueryNormalizer;

public class QueryService {
	
	private QueryPlanCache cache = new QueryPlanCache();
	private QueryNormalizer normalizer = new QueryNormalizer();
	
	private int newSchemaVersion = 1;		// current schema version
	private int lastCacheVersion = 1;	// version when cache was last valid
	
//	for METRICS
	private int hitCount = 0;
	private int missCount = 0;
	
	private long totalTimeWithoutCache = 0;
	private long totalTimeWithCache = 0;
	
//	with Cache
	public QueryPlan executeQuery(String query) {
		long startTime = System.nanoTime();
		
		// check Schema change
		if( newSchemaVersion != lastCacheVersion ) {
			System.out.println("Schema changed -> Clearing cache");
			cache.clear();
			lastCacheVersion = newSchemaVersion;
		}
		
		String normalized = normalizer.normalize(query);
		
		QueryPlan plan = cache.getPlan(normalized);
		
		if( plan != null ) {
			hitCount++;			// track hit
			System.out.println("Cache HIT");
		} else {
			missCount++;		// track miss
			System.out.println("Cache MISS");
			
			plan = generatePlan(normalized);
			cache.putPlan(normalized, plan);
		}
		
		long endTime = System.nanoTime();
		long timeTaken = endTime - startTime;
		
		totalTimeWithCache += timeTaken;
		System.out.println("Time: " + timeTaken + " ns\n");
		
		return plan;
	}
	
//	without Cache
	public void executeWithoutCache(String query) {
		long startTime = System.nanoTime();
		
		String normalized = normalizer.normalize(query);
		
		generatePlan(normalized);
			
		long endTime = System.nanoTime();
		
		long timeTaken = endTime - startTime;
		
		totalTimeWithoutCache += timeTaken;
		
		System.out.println("Time: " + timeTaken + " ns\n");
	}
	
	
	
//	plan generation
	public QueryPlan generatePlan(String query) {
		try {
			Thread.sleep(100);		// plan generation takes some time, so here we are adding 
									// manually some time
		}catch (InterruptedException ex){
			ex.printStackTrace();
		}
		
		if( query.contains("WHERE")) {
			return new QueryPlan("{\"plan\": \"INDEX SCAN\" }");
		}
		else {
			return new QueryPlan("{\"plan\": \"FULL TABLE SCAN\" }");
		}
	}
	
		//	schema handler
	public void updateSchema() {
		System.out.println("Schema updated (index added/ structure changed)");
		newSchemaVersion++;
	}
	
	
//	stats
	public void printStats() {
		int total = hitCount + missCount;
		
		System.out.println("\n==== Cache Status ====");
		System.out.println("Total Queries: "+ total );
		System.out.println("Cache Hits: "+ hitCount);
		System.out.println("Cache Miss "+ missCount);
		
		if( total > 0 ) {
			double ratio = (hitCount * 100.0)/total;
			System.out.println("Hit Ratio: "+ ratio + '%');
		}
	}
	
//	performance
	public void printPerformance() {
			System.out.println("\n === PERFORMANCE REPORT ===");
			
			System.out.println("Total Time WITHOUT Cache: " + totalTimeWithoutCache + " ns");
			System.out.println("Total Time WITH Cache: " + totalTimeWithCache + " ns");
			
			if( totalTimeWithoutCache > 0 ) {
				double improvement = ((totalTimeWithoutCache - totalTimeWithCache) * 100.0) / 
																	totalTimeWithoutCache;
				
				System.out.println("Performance Improvement: " + improvement + "%");
			}
	}
	
	

	

}
