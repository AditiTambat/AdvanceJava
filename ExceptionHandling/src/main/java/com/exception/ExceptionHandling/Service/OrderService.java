package com.exception.ExceptionHandling.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.ExceptionHandling.Entity.Order;
import com.exception.ExceptionHandling.Repository.OrderRepo;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepo repository;
	
	
	public Order addOrderDetail(Order order) {
//		if(order.getOid()==){
//			throw  new Exception ("Customer already exists");
//		}
		
		Order orderdata =   repository.save(order);
	
		return orderdata;
	}
	
	
	public List<Order> showAllOrder(){
		return repository.findAll();
	}

}
