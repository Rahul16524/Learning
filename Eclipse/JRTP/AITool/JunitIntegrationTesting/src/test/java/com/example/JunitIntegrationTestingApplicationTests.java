package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entity.Order;
import com.example.repository.OrderRepository;
import com.example.service.OrderService;

@SpringBootTest
class JunitIntegrationTestingApplicationTests {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private OrderRepository orderRepository;

	@Test
	void contextLoads() {
		
		Order order = new Order();
		
		order.setProductName("Lapi");
		order.setQuantity(3);
		
		Order savedOrder = orderService.saveOrder(order);
		
		assertEquals("Laptop", savedOrder.getProductName());
		assertEquals(3, savedOrder.getQuantity());
	}

}
