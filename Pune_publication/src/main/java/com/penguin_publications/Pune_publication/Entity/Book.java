package com.penguin_publications.Pune_publication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;   //@Id is for primary key uses in table
	private String bName;
	private double price;
	private double ratings;
	
	
	@JoinColumn
	@OneToOne
	private Author author;            //foreign key
	
	
	

	public Book() {
		super();
	}






	public Book(int id, String bName, double price, double ratings, Author author) {
		super();
		this.id = id;
		this.bName = bName;
		this.price = price;
		this.ratings = ratings;
		this.author = author;
	}
	

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public Author getAuthor() {
		return author;
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
