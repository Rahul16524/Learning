package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class JunitIntegrationTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunitIntegrationTestingApplication.class, args);
	}

}
