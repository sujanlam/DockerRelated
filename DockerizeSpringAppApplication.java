package com.tutrl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/msg")

public class DockerizeSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerizeSpringAppApplication.class, args);
		System.out.println("Hello!!! Dccker App is running!");
	}

	@GetMapping
	public String hello() {
		return "Hello World!";
	}

}
