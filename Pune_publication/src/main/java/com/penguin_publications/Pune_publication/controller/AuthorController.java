package com.penguin_publications.Pune_publication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.penguin_publications.Pune_publication.Entity.Author;
import com.penguin_publications.Pune_publication.service.AuthorService;




@RequestMapping("/authorcontroller")
@RestController
public class AuthorController {
	
	@Autowired
	private AuthorService service;
	 
//	 public AuthorController(AuthorService service) {
//		 this.service=service;
//	 }
	
	 
	
	@PostMapping("/addauthor")
	public Author addAuthor(@RequestBody Author author) throws Exception {
	
	     return service.addAuthorDetails(author);		
	}
	
	
	
	
	@GetMapping("/getallauthor")
//	@Cacheable("author")
	public List<Author> getAllAuthor() throws Exception{
		Thread.sleep(3000);
		System.out.println("from database..");
		return service.getAllAuthorDetails();
	}
	
	
	

}
