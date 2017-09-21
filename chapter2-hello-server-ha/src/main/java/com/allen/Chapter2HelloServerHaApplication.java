package com.allen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Chapter2HelloServerHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chapter2HelloServerHaApplication.class, args);
	}
}
