package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerTestApplication {

	@GetMapping("/test")
	public String test() {
		return "Hello world";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(DockerTestApplication.class, args);
	}
	
	

}
