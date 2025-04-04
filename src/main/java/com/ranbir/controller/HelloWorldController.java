package com.ranbir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/message")
	public String getMessage() {
		
		return "Hii RANBIR SAHU Welcome to JAVA & AWS World";
	}
	

}
