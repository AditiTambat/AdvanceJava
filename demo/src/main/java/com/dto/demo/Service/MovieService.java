package com.dto.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.demo.Entity.Movie;
import com.dto.demo.Repository.MovieRepos;

@Service
public class MovieService {

	
	@Autowired
	private MovieRepos repos;
	
	public Movie addmovie(Movie movie)
	{
		
		return repos.save(movie);
	}

	public Movie findbypk(int id)
	{
		return repos.findById(id).get();
	}
	
	
}
