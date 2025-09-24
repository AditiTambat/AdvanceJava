package com.icic.mobikwik.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherService {
	
	@GetMapping("/cashmethod")
	public String cashPayment() {
		return "Payment Done successfully";
	}
	
	
	
	//http -> POST,PUT, GET,DELETE,PATCH
	
	//when there is two same method in two different class then it  provide ambiguous mapping
//	@GetMapping("/getmethod")
//	public String anothermeth() {
//		return "SpringBoot";
//	}
}