package com.querycache;
import org.antlr.v4.runtime.CharStreams;

import com.querycache.service.QueryService;

public class Main {
	public static void main(String[] args) {
//		System.out.println("ANTLR working: "+ CharStreams.class.getName());
		
		QueryService service = new QueryService();
		
////		test queries
//		service.executeQuery("SELECT * FROM orders WHERE customer_id = 'Rohan'");
//		service.executeQuery("SELECT * FROM orders WHERE customer_id = 'Vijay'");
//		
////		when schema got changed
//		service.updateSchema();
//		service.executeQuery("SELECT * FROM orders WHERE customer_id = 101");
//		
		
		System.out.println("=== WITHOUT CACHE ===");	// both taking approx 100 ms
		service.executeWithoutCache("SELECT * FROM orders WHERE customer_id = 101");
		service.executeWithoutCache("SELECT * FROM orders WHERE customer_id = 202");

		System.out.println("\n=== WITH CACHE ===");
		service.executeQuery("SELECT * FROM orders WHERE customer_id = 101");	// 100 ms
		service.executeQuery("SELECT * FROM orders WHERE customer_id = 202");	// 1 ms

		// ✅ PRINT PERFORMANCE HERE (before schema change)
		service.printPerformance();

		// ================= SEPARATE TEST =================
		System.out.println("\n=== SCHEMA CHANGE TEST ===");

		service.updateSchema();
		service.executeQuery("SELECT * FROM orders WHERE customer_id = 101");

		service.printStats();		// calculated for executequery() (with CACHE)
	}
}
