package com.example;
//open project location where its docker file is present, open cmd for that, type
//docker compose up
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// run java appln
// on browser send the request: http://localhost:8080/send/yes

@SpringBootApplication
public class KafkaPart1Application {

	public static void main(String[] args) {
		SpringApplication.run(KafkaPart1Application.class, args);
	}

}
