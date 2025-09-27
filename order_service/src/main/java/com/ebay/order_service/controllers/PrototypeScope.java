package com.ebay.order_service.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeScope {
	
	public PrototypeScope() {
		System.out.println("Beans create seperate for each refference");
	}

}
