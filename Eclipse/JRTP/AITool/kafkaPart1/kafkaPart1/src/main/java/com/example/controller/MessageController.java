package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.producerService.MessageProducer;

@RestController
public class MessageController {
	
	@Autowired
	private MessageProducer messageProducer;
	
	@GetMapping("/send/{msg}")
	public String send(@PathVariable("msg") String mesge) {
		
		messageProducer.sendMessage(mesge);
		
		System.out.println("message from messageController has been sent");
		
		return "message sent";
	}
	
	
}
