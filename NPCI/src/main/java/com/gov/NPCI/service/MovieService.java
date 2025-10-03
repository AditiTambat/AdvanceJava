package com.gov.NPCI.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gov.NPCI.classes.Movie;

@Service
public class MovieService {
	
	@Autowired
	private Movie movie;
	
	
	public String showdetails() {
		
		String col="350cr";
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
	
	
	public List<Movie> addMovies(){
		
		List<Movie> list=Arrays.asList (
				new Movie ("Chota Bheem","600cr",7.2),
				new Movie ("RaOne","320cr",7.5),
				new Movie ("Baal Ganesh","520cr",8.2),
				new Movie ("Karthikey","420cr",5.5),
				new Movie ("Deool band","450cr",8.5)
			);
		return list;
				
	}
	
	  
	public List<Movie> showMovies(){
		return addMovies().stream().sorted((i, j)->(int)j.ratings-(int)i.ratings
		).collect(Collectors.toList());
	}
	
	
	
	public Movie searchMovie(String name2) throws Exception {
		List<Movie> list= addMovies();
		Iterator<Movie> itr =list.iterator();
		Movie m2=new Movie();
		while(itr.hasNext()){
			Movie movie=itr.next();
			if((movie.name).equalsIgnoreCase(name2)){
				m2= movie;
				break;
			}
			else{
				m2=null;
				
			}
		}
		if(m2==null){
			throw new Exception("Movie not found..");
		}
		return m2;
	}
	
	
//	public List<Movie> toprating(){
//		
//		List<Movie> list=addMovies();
//		
//		return list.stream().
//				
//	}
	
	
	
	public String add_1(String name, String collection, double ratings) {
		
		List<Movie> list= new ArrayList(addMovies());
		
		Movie movie = new Movie();
		movie.setName(name);
		movie.setCollections(collection);
		movie.setRatings(ratings);
		list .add(movie);
		return movie.getName()+" added sucessfully";
		
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

