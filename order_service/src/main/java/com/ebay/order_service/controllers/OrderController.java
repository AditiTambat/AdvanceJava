package com.ebay.order_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebay.order_service.components.Order;

@RestController

public class OrderController {
	
	@Autowired
	private Order order1; //dependency injecttion
	
	
	
	
	
	
	@GetMapping("/getgreet")
	public String greetings() {
		return "Hello, Welcome to green city";
	}
	
	
	@GetMapping("/getcode")
	public Object getre(){
		return order1.getdet();
	}
	
	
	@GetMapping("/getcode-2")
	public Object getre2(){
		return order1.getdet();
	}

}
