package com.penguin_publications.Pune_publication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.penguin_publications.Pune_publication.Entity.Book;
import com.penguin_publications.Pune_publication.Repository.BookRepos;

@Service
public class BookService {
	
	
	@Autowired
	private BookRepos repository;
	
	
	public Book addBooks(Book book)  {
		
		
//		if(book==null)
//		{
//			throw new Exception("book can't be null");
//		}
		
		System.out.println("recieved book "+book.getbName());
		System.out.println("saving data in DB");
		
		Book savedBook	= repository.save(book);
		
		System.out.println("book saved.");
		
		return savedBook;
	}
	
	
	
	public Page<Book> getall(Pageable pageable){

//		 Pageable=>Data.domain.
//		 Pageable  instance=> repository methods. ex.findAll();
//		 take the limited data set out of the total data.
		
		return repository.findAll(pageable);
		
		//only 2 books per page are return
	}
}
