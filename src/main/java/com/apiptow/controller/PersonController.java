package com.apiptow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController {
	
	@GetMapping
	public String getBook() {
		return "API TEST"; 
	}
	
	
	
}
