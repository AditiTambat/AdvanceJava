package com.ebay.order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ebay.order_service.components.Order;
import com.ebay.order_service.controllers.PrototypeScope;
import com.ebay.order_service.controllers.RequestScope;
import com.ebay.order_service.controllers.SingletoneScope;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		ApplicationContext	 con = SpringApplication.run(OrderServiceApplication.class, args);
		
	
		Order order1=con.getBean(Order.class);
		Order order2=con.getBean(Order.class);
		
		SingletoneScope s1 =con.getBean(SingletoneScope.class);
		SingletoneScope s2 =con.getBean(SingletoneScope.class);
		
		PrototypeScope p1 = con.getBean(PrototypeScope.class);
		PrototypeScope p2 = con.getBean(PrototypeScope.class);
		PrototypeScope p3 = con.getBean(PrototypeScope.class);
		
		RequestScope request = con.getBean(RequestScope.class);
	
		
		
		
		
		
		
		
		
	
//		System.out.println(order1.hashCode()==order2.hashCode());
//		
//		System.out.println("Counter:"+order1.counter);
	}

}
