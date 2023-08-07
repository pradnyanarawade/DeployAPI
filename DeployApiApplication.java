package com.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployApiApplication.class, args);
	}

	
	@GetMapping("/add")
	public String add()
	{
		return "welcome";
	}
}
