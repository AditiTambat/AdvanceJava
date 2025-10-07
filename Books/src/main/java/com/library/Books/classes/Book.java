package com.library.Books.classes;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	private String name;
	private String author;
	private double price;
	private double rating;
	private int publishyear;
	private int pages;
	
	
	
	public Book() {
		System.out.println("book bean created");
	}



	public Book(String name, double price, String author, int publishyear, double rating, int pages) {
		this.name = name;
		this.price = price;
		this.author = author;
		this.publishyear = publishyear;
		this.rating = rating;
		this.pages = pages;

	}


	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + ", publishyear=" + publishyear
				+ ", rating=" + rating + ", pages=" + pages + "]";
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}



	public int getPublishyear() {
		return publishyear;
	}
	
	public void setPublishyear(int publishyear) {
		this.publishyear = publishyear;
	}
	

	public double getRating() {
		return rating;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}



	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}



	



	


	
	
	
	

}
