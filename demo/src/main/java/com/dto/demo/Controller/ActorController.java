package com.dto.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.demo.Dto.ActorDto;
import com.dto.demo.Entity.Actor;
import com.dto.demo.Repository.ActorRepos;
import com.dto.demo.Service.ActorService;

@RequestMapping("/actorcontroller")
@RestController
public class ActorController {
	
	@Autowired
	private ActorService service;
	
	@Autowired
	private ActorRepos repos;
	
	
	@PostMapping("/add-actor")
	public Actor addactordetail(@RequestBody Actor act)
	{
		return service.addactor(act);
	}
	
	
	@GetMapping("/get-actor-id/{id}")
	public ActorDto getbyid(@PathVariable("id") int id)
	{
		return service.getbyidact(id);
	}
	
	
	@GetMapping("/get-by-name/{name}")
	public List<Actor> getbyname(@PathVariable("name") String name)
	{
		return service.findname(name);
		
	}
	
	@PutMapping("/update/{id}/{name}")
	public int  update(@PathVariable("id") int id, @PathVariable("name") String name)
	{
		return service.updatenamebyid(id, name);
	}
	
	@GetMapping("/find-all")
	public List<Actor>findadll()
	{
		return  repos.findAll();
		
		
		
	}
}
