package com.example.consumerService;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

	@KafkaListener(
			topics="demo-topic",
			groupId="my-group"
			)
	public void consume(String message) {
		System.out.println("Message received: " + message);
	}
	
}
