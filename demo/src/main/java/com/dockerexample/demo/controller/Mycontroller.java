package com.dockerexample.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	
	
	
	@GetMapping("/hello")
	
	public String m1() {
		
		
		return "docker image created";
	}

}
