package com.deliverytech.delivery_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DeliveryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryApiApplication.class, args);
	}

	@PostConstruct
	public void showJavaVersion() {
    	System.out.println("Java version: " + System.getProperty("java.version"));
	}

}