package com.querycache.cache;

import java.util.HashMap;
import java.util.Map;

import com.querycache.model.QueryPlan;

public class QueryPlanCache {

	private Map<String, QueryPlan> cache = new HashMap<>();
	
	public QueryPlan getPlan(String normalizedQuery) {
		return cache.get(normalizedQuery);
	}
	
	public void putPlan(String normalizedQuery, QueryPlan plan) {
		cache.put(normalizedQuery, plan);
	}
	
	public void clear() {
		cache.clear();
	}
}
