package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WineController {
	
	@GetMapping(value="/search")
	public String displaySearch() {
		return "search";
	}
	
//	@GetMapping(value="/search")
//	public String displaySearchResult() {
//		
//		// Connect to the API with entered search conditions.
//		// Display the list of results.
//		
//		return "";
//	}

}
