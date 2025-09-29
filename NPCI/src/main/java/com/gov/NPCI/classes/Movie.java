package com.gov.NPCI.classes;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	
	public String name;
	public String collections;
	public double ratings;
	
	
	// if we not take non parameterized constructor it will call default constructor for beans creation
	// bcos beans creation needs no args constructor 
	// if you have parameterized constructor you must ,
	//have to take one non parameterized/no args constructor bcos spring Ioc needs no args constructor to crate beans of that class
	
	public Movie() {
		System.out.println("movie created..");
	}
	
	public Movie(String name, String collections, double ratings) {
		this.name=name;
		this.collections=collections;
		this.ratings=ratings;
	}
	
	
	

	@Override
	public String toString() {
		return "Movie [name=" + name + ", collections=" + collections + ", ratings=" + ratings + "]";
	}
	
	

}
