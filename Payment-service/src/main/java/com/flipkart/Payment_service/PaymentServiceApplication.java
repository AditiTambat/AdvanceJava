package com.flipkart.Payment_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;

@SpringBootApplication
public class PaymentServiceApplication {

	public static  void main(String[] args) {
	ApplicationContext context	= SpringApplication.run(PaymentServiceApplication.class, args);
	
	Animal animal=context.getBean(Animal.class);
	Plant plant=context.getBean(Plant.class);
		
	
	animal.play();
	System.out.println(" !!!!!!!!!!! ");
	plant.breath();
	
	String [] arr=context.getBeanDefinitionNames();
	int count=context.getBeanDefinitionCount();
	System.out.println(count);
	System.out.println(arr.length);
	
	System.out.println("****************");
	
	for(String str:arr) {
		System.out.println("Beans: "+str);
	}
	
	}

}
