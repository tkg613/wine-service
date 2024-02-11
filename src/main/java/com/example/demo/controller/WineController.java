package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WineController {
	
	@GetMapping(value="/search")
	public String displaySearch() {
		return "/search";
	}

}
