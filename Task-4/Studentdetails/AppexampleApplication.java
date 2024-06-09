package com.samples.appexample;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppexampleApplication.class, args);
		System.out.println("picking the values from application.properties file");
	}

}
