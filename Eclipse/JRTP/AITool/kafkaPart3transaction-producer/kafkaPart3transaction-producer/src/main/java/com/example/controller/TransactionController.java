package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Transaction;
import com.example.producerService.TransactionProducer;

@RestController
public class TransactionController {

	@Autowired
	private TransactionProducer producer;
	
	
	@GetMapping("/send")
	public String send() {
		
		producer.send(
				new Transaction(
						"Vijay",		// from key automatically decide which partition it will going to go internally
						"Deposit",
						1000.0
						)
				);
		
		producer.send(
				new Transaction(
						"Vijay",
						"WithDraw",
						200.0
						)
				);
		
		producer.send(
				new Transaction(
						"Vijay",
						"Transfer",
						300.0
						)
				);
		
		producer.send(
				new Transaction(
						"Amit",
						"Deposit",
						500.0
						)
				);
		
		producer.send(
				new Transaction(
						"Amit",
						"Transfer",
						100.0
						)
				);
		
		producer.send(
				new Transaction(
						"Priya",
						"Deposit",
						700.0
						)
				);
		
		
		return "Transaction Sent";
	}
	
}
