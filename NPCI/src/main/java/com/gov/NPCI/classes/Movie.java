package com.gov.NPCI.classes;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	
	public String name;
	public String collections;
	public double ratings;
	
	public Movie() {
		System.out.println("movie created..");
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", collections=" + collections + ", ratings=" + ratings + "]";
	}
	
	

}
