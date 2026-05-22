package com.querycache.parser;

public class QueryNormalizer {
	
	public String normalize(String query) {
		return query.replaceAll("\\d+","?");
	}
}
