package com.amdocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Batch3Application {
	@GetMapping ("/msg")
	public String show()
	{
		return "welcome to jenkin session";
	}

	public static void main(String[] args) {
		SpringApplication.run(Batch3Application.class, args);
	}

}
