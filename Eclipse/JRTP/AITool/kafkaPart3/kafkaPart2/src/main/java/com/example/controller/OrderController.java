package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Order;
import com.example.producer.OrderProducer;

@RestController
public class OrderController {

	@Autowired
    private OrderProducer producer;

    @GetMapping("/sendOrder")
    public String sendOrder() {

        Order order =
                new Order(1, "Laptop", 50000);

        producer.sendOrder(order);

        return "Order Sent";
    }
}
