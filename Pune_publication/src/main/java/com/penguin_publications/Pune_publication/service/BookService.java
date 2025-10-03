package com.penguin_publications.Pune_publication.service;

import org.springframework.beans.factory.annotation.Autowired;
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
}
