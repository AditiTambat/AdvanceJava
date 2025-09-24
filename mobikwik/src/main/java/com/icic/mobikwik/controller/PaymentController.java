package com.icic.mobikwik.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	
	@GetMapping("/getdata")
	public String returngreeting() {
		return "Advance Java";
	}
	
	
	@GetMapping("/getmethod")
	public String anothermeth() {
		return "SpringBoot";
	}

}
