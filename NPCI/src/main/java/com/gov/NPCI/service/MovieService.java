package com.gov.NPCI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gov.NPCI.classes.Movie;

@Service
public class MovieService {
	
	@Autowired
	private Movie movie;
	
	
	public String showdetails() {
		
		String col="350";
		String name="Fall";
		double ratings=9.3;
		
		movie.collections=col;
		movie.name=name;
		movie.ratings=ratings;
		
		if(movie.ratings>9.0)
		{
			return movie.toString();
		}
		return "Movie ratings is less than criteria";
	}
	
}
