package com.library.Books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.Books.classes.Book;
import com.library.Books.service.BookService;

@RestController
public class BookController {
	
	
	@Autowired
	private BookService service;      //dependency injection
	
	
	
	@GetMapping("/getbooks")
	public List<Book> getBooks(){
		
		return service.allDetails();
	}
	
	
//	
//	@GetMapping("/bookprice")
//	public List<Book> sortPrice(){
//		
//		return service.sortbyPrice();
//	}
	
	
	
	@PostMapping("/searchbook")
	public List<Book> searchbookbyName(@RequestParam String name){
		
		return service.searchBook(name);
		
	}
	
	
	
	
	@PostMapping("/bookauthor")
	public List<Book> searchbookbyAuthor(@RequestParam String author){
		
		return service.searchbyAuthor(author);
		
	}
	
	
	
	
	
//	@PostMapping("/bookauthor/{var}")
//	public List<Book> searchbookbyAuthor(@PathVariable("var") String author){
	
//		return service.searchbyAuthor(author);
//	}

	
	
	private String name;
	private String author;
	private double price;
	private double rating;
	private int publishyear;
	private int pages;
	
	@PostMapping("/addbook")
	public String NewBook(@RequestParam String name,@RequestParam String author , @RequestParam double publishyear,@RequestParam double ratings,@RequestParam int pages){
		return service.addNewBook(author, author, ratings, ratings, pages, pages);
	}
	
	//requestbody
	
}
