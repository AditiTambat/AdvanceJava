package com.exception.ExceptionHandling.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	private int oid;
	
	@NotBlank(message="Order Required")
	private String oname;
	
	
	 @ManyToOne
	 @JoinColumn(name = "customer_id") 
	 private Customer customer;

	

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOname() {
		return oname;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}
	
	
	
	
}
