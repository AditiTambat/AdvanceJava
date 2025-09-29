package com.gov.NPCI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gov.NPCI.classes.Movie;
import com.gov.NPCI.service.MovieService;

@RestController
public class MovieController {

	@Autowired 
	private MovieService service;
	
	
	@GetMapping("/getmeth")
	public String getmethod() {
		
		return service.showdetails();
	}
	
	
	@GetMapping("/allMovies")
	public List<Movie> getallMovies() {
		return service.showMovies();
	}
	
	
	@PostMapping("/findmovie")
	public Movie findMovie(@RequestParam String name2 ) throws Exception {
		return service.searchMovie(name2);
	}
}
