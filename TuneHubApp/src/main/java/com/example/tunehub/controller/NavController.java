package com.example.tunehub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	
	@GetMapping("/map-register")
	public String registerMapping() {
		return "register";
	}
	@GetMapping("/map-login")
	public String loginMapping() {
		return "login";
	}
	@GetMapping("/map-songs")
	public String songMapping() {
		return "addsongs";
	}
	@GetMapping("/samplepayment")
	public String samplePayment() {
		return "samplepayment";
	}
	 @GetMapping("/index")
	    public String homePage() {
	        return "index"; // This corresponds to the "about.html" in the "resources/templates" directory
	    }
	 @GetMapping("/login")
	    public String loginPage() {
	        return "login"; // This corresponds to the "about.html" in the "resources/templates" directory
	    }
	 @GetMapping("/register")
	    public String registerPage() {
	        return "register"; // This corresponds to the "about.html" in the "resources/templates" directory
	    }
	
	
	}
	
	

