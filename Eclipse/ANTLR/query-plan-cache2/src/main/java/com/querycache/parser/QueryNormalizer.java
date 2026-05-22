package com.querycache.parser;

public class QueryNormalizer {
	
//	replace numbers
	public String normalize(String query) {
		query = query.replaceAll("\\b\\d+\\b","?");
		
		query = query.replaceAll("'[^']*'", "?"); 		// normalize string
		
		query = query.replaceAll("\\s+", " ").trim();	// normalize spaces
		
		query = query.toUpperCase();
				
		return query;
	}
	
	
}
