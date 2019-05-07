package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TextController {

	@GetMapping("/")
	private String index() {
		return "textupload";
	}
	
	
	
}
