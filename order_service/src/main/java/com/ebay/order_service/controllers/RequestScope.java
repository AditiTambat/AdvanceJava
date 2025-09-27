package com.ebay.order_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope

@RestController
public class RequestScope {
	public RequestScope(){
		System.out.println("Beans created for each client request, when browser changed");
	}
	
	@GetMapping("/request")
	public String request() {
		return "requst method";
	}

}
