package com.penguin_publications.Pune_publication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.penguin_publications.Pune_publication.Entity.Book;
import com.penguin_publications.Pune_publication.service.BookService;


@RequestMapping("/book-controller")
@RestController
public class BookController {
	
	@Autowired
	private BookService service;
	
	
	@PostMapping("/addbook")
	public  Book addBookController(@RequestBody Book book) {
		System.out.println(book.getId());
		return service.addBooks(book);
	}
	
	
	@GetMapping("/getallbooks")
	public List<Book> getallBooks(){
		return service.getall();
	}

}
