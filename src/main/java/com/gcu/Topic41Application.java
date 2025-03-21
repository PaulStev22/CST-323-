package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@SpringBootApplication
@ComponentScan({"com.gcu"})
public class Topic41Application {

	public static void main(String[] args) {
		SpringApplication.run(Topic41Application.class, args);
	}

}
