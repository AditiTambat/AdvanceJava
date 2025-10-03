package com.penguin_publications.Pune_publication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	private int id;   //@Id is for primary key uses in table
	private String bName;
	private double price;
	private double ratings;
	

	
	public Book() {
		super();
	}


	public Book(int id, String bName, double price, double ratings) {
		super();
		this.id = id;
		this.bName = bName;
		this.price = price;
		this.ratings = ratings;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getbName() {
		return bName;
	}


	public void setbName(String bName) {
		this.bName = bName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getRatings() {
		return ratings;
	}


	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	
	
	
	
	
	

}
