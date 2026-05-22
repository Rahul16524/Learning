package com.example.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.model.Order;

@Service
public class OrderConsumer {
	
	@KafkaListener(
            topics = "orders-topic",
            groupId = "my-group"
    )
    public void consume(Order order) {

        System.out.println("Order Received");

        System.out.println(order.getId());

        System.out.println(order.getProduct());

        System.out.println(order.getPrice());
    }

	
}
