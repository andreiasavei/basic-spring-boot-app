package com.example.basicspringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.*;


@SpringBootApplication
public class BasicSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringBootAppApplication.class, args);
	}

}

// Add the controller.
@RestController
class HelloWorldController {
	@GetMapping("/")
	public String hello() {
		return "hello world!";
	}
}
