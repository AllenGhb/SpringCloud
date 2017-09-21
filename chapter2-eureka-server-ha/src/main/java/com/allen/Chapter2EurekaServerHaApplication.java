package com.allen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Chapter2EurekaServerHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chapter2EurekaServerHaApplication.class, args);
	}
}
