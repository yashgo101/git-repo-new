package com.first.mavenio.sampleappdous.models;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ViewController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
}
