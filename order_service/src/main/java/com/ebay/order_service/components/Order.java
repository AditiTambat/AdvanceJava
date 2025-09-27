package com.ebay.order_service.components;

import org.springframework.stereotype.Component;

@Component

public class Order {
	public Order() {
		System.out.println("Order placed successfully.");
	}
	
	public String getorderdetails()
	{
		
		return "Product: water bottle, price:3432.43, ratings:6.7";
	}
	
	
    public Object getdet()
    {
    	return this.hashCode();
    }
}
