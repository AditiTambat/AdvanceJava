package com.dto.demo.Service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.demo.Dto.ActorDto;
import com.dto.demo.Dto.MovieDto;
import com.dto.demo.Entity.Actor;
import com.dto.demo.Entity.Movie;
import com.dto.demo.Repository.ActorRepos;

@Service
public class ActorService {
	
	
	@Autowired
	private ActorRepos repo;
	
	
	public Actor addactor(Actor actor)
	{
		return repo.save(actor);
	}
	
	public ActorDto getbyidact(int id)
	{
		return  (converter(repo.findById(id).get()));
	}
	
	
	
	public static ActorDto converter( Actor act)
	{
		  ActorDto dto=new ActorDto();
		  
		  dto.setAname(act.getAname());
		  
		  dto.setMovies(act.getMovies().stream().map(ActorService::con2).collect(Collectors.toList()));
		  
		 
		  return dto;
		  
	}
	
	public static MovieDto con2(Movie movie)
	{
	MovieDto dto=new MovieDto();
	
	dto.setName(movie.getName());
	return dto;
	
	}
}
