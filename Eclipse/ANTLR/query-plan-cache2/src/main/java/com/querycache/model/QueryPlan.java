package com.querycache.model;

public class QueryPlan {
	private String jsonPlan;
	
	public QueryPlan(String jsonPlan) {
		this.jsonPlan = jsonPlan;
	}
	
	public String getJsonPlan() {
		return this.jsonPlan;
	}
}
