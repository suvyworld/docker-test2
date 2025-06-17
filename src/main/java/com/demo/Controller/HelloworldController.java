package com.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	
	public String getMessage() {
		return "Hello-World";
	}
}
