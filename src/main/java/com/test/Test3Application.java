package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test3Application {

	public static void main(String[] args) {
		String name = "mike";
		int x = 100;
		boolean isPresent = false;
		SpringApplication.run(Test3Application.class, args);
	}

}
