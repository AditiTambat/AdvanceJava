package com.penguin_publications.Pune_publication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.penguin_publications.Pune_publication.Entity.Book;
import com.penguin_publications.Pune_publication.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService service;
	
	
	@PostMapping("/addbook")
	public  Book addBookController(@RequestBody Book book) {
		
		return service.addBooks(book);
	}
	
	

}
