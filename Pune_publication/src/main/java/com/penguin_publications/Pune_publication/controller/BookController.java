package com.penguin_publications.Pune_publication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.penguin_publications.Pune_publication.Entity.Book;
import com.penguin_publications.Pune_publication.service.BookService;

import jakarta.validation.Valid;


@RequestMapping("/bookcontroller")
@RestController
public class BookController {
	
	@Autowired
	private BookService service;
	
	
	@PostMapping("/addbook")
	public  Book addBookController(@Valid @RequestBody Book book) {
		System.out.println(book.getId());
		
		return service.addBooks(book);
	}
	
	
	@GetMapping("/getallbooks")
	public Page<Book> getallBooks(@RequestParam int pagenumber,@RequestParam  int pagesize,
			@RequestParam String sortre, @RequestParam String order){
		
		String str2=order.toLowerCase();
		if(str2.equals("asc")){
			Sort sort2=Sort.by(sortre).ascending();
			//System.out.println(PageRequest.of(pagenumber, pagesize, sort2));
			return service.getall(PageRequest.of(pagenumber, pagesize, sort2));
		}
		
		else{
			
			Sort sort=Sort.by(sortre).descending();
			return service.getall(PageRequest.of(pagenumber, pagesize, sort));
		}
		
		
	}
}


