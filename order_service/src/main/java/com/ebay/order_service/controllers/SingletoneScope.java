package com.ebay.order_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingletoneScope {
	
	public SingletoneScope() {
		System.out.println("Beans created once in singletone scope");
		
	}
	
	@GetMapping("/meth1")
	public String method1() {
		return "Method One";
	}

}
