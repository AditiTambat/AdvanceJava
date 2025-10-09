package com.dto.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.demo.Entity.Movie;
import com.dto.demo.Service.MovieService;

@RestController
@RequestMapping("/moviecontroller")
public class MovieController {

	
	@Autowired
	private MovieService service;
	
	@PostMapping("/add-movie")
	public Movie addmovie(@RequestBody Movie movie)
	{
		return service.addmovie(movie);
	}
	
	
	@GetMapping("/get-movie-id/{id}")
	public Movie getbyiddd(@PathVariable("id") int id)
	{
		return service.findbypk(id);
	}
}
