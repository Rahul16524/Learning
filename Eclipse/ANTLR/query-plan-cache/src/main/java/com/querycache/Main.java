package com.querycache;
import org.antlr.v4.runtime.CharStreams;

import com.querycache.service.QueryService;

public class Main {
	public static void main(String[] args) {
//		System.out.println("ANTLR working: "+ CharStreams.class.getName());
		
		QueryService service = new QueryService();
		
		
		service.executeQuery("SELECT * FROM orders WHERE customer_id = 101");
		service.executeQuery("SELECT * FROM orders WHERE customer_id = 202");
		service.executeQuery("SELECT * FROM orders WHERE customer_id = 101");
		
		
	}
}
