package com.example.create.endpoints;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.example.create.endpoints.controllers"})
public class EndpointsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndpointsApplication.class, args);
	}

}
