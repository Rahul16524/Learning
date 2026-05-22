package com.example.producerService;


//message
//↓
//serialized into bytes
//↓
//sent over TCP
//↓
//stored in Kafka topic
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMessage(String message) {
		
		kafkaTemplate.send("demo-topic", message);
		
		System.out.println("Message sent");
	}
}
