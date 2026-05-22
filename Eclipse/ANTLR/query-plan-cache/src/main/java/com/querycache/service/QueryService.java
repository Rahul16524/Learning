package com.querycache.service;

import com.querycache.cache.QueryPlanCache;
import com.querycache.model.QueryPlan;
import com.querycache.parser.QueryNormalizer;

public class QueryService {
	
	private QueryPlanCache cache = new QueryPlanCache();
	private QueryNormalizer normalizer = new QueryNormalizer();
	
	public QueryPlan executeQuery(String query) {
		String normalized = normalizer.normalize(query);
		
		QueryPlan plan = cache.getPlan(normalized);
		
		if(plan != null) {
			System.out.println("Cache HIT");
			return plan;
		}
		
		System.out.println("Cache miss");
		
		
		QueryPlan newPlan = new QueryPlan("{plan: 'generated'}");
		
		cache.putPlan(normalized, newPlan);
		
		return newPlan;
		
	}
	
	
}
