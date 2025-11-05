package com.exception.ExceptionHandling.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.ExceptionHandling.Entity.Order;
import com.exception.ExceptionHandling.Service.OrderService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/ordercontroller")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	
	
	
	@PostMapping("/addorder")
	public Order addOrder(@Valid @RequestBody Order order) {
		return service.addOrderDetail(order);
	}
	
	
	@GetMapping("/showorder")
	public List<Order> showOrder(){
		return service.showAllOrder();
	}

}
