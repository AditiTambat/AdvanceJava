package com.penguin_publications.Pune_publication.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.penguin_publications.Pune_publication.Entity.Author;
import com.penguin_publications.Pune_publication.service.AuthorService;


@RequestMapping("/author-controller")
@RestController
public class AuthorController {
	
	
	 AuthorService service;
	 
	 public AuthorController(AuthorService service) {
		 this.service=service;
	 }
	
	 
	
	@PostMapping("/add-author")
	public Author addAuthor(@RequestBody Author author) throws Exception {
	
	     return service.addAuthorDetails(author);		
	}
	
	
	
	@GetMapping("/get-all-author")
	public List<Author> getAllAuthor() throws Exception{
		
		return service.getAllAuthorDetails();
	}
	
	
	

}
