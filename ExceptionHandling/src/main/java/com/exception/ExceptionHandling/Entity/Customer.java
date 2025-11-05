package com.exception.ExceptionHandling.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "customers")
public class Customer {
	
	@Id
	private int cusid;
	
	@NotBlank(message="name cannot be blank.")
	@Column(nullable=false)
	private String name;
	
	@NotBlank(message="Address required")
	private String address;
	
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders;


	


	public int getCusid() {
		return cusid;
	}


	public void setCusid(int cusid) {
		this.cusid = cusid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public List<Order> getOrders() {
		return orders;
	}


	public void setOrders(List<Order> orders) {
	    this.orders = orders;
	    if (orders != null) {
	        orders.forEach(order -> order.setCustomer(this));  
	    }
	}
	
	

	

}
