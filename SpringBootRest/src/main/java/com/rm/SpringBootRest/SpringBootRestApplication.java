package com.rm.SpringBootRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
		System.out.println("Spring Boot Application Starts Here!!!");
	}

}
