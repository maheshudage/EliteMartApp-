package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.tka")
@SpringBootApplication
public class EliteMartApplication {

	public static void main(String[] args) {
		SpringApplication.run(EliteMartApplication.class, args);
		System.err.println("App Started");
	}

}
