package com.dev.quickstart;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloWorldController {
	
	@GetMapping(path="/hello")
	public String helloWorld() {
		return "Hello Dev";
	}
}
