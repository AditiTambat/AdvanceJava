package com.exception.ExceptionHandling.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.ExceptionHandling.Entity.Customer;
import com.exception.ExceptionHandling.Service.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/custcontroller")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	
	@PostMapping("/addcustomer")
	public Customer addCustomer(@Valid @RequestBody Customer customer) {
		
		return service.addCustomerDetail(customer);
	}
	
	
	@GetMapping("/showcustomer")
	public List<Customer> showCustomer(){
		return service.showCustomerDetails();
	}
	
	
	

}
