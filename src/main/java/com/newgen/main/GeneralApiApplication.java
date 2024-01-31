package com.newgen.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.newgen")
public class GeneralApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeneralApiApplication.class, args);
		System.out.println("******************** Application Started ****************");
	}

}
