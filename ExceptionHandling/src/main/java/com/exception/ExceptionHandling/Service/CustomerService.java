package com.exception.ExceptionHandling.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.ExceptionHandling.Entity.Customer;
import com.exception.ExceptionHandling.Exceptions.CustomerExists;
import com.exception.ExceptionHandling.Repository.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo  repository;
	
	
	public Customer addCustomerDetail(Customer customer) {		
		 if (customer.getOrders() != null) {
		        customer.getOrders().forEach(order -> order.setCustomer(customer));
		    }
		 if(repository.existsById(customer.getCusid())){
			 throw new CustomerExists("Customer "+customer.getCusid()+" already exists");
		 }
		    return repository.save(customer);
		
	}
	
	
	public List<Customer> showCustomerDetails(){
		
		return repository.findAll();
	}

}
