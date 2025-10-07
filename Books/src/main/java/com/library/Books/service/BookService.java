package com.library.Books.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.Books.classes.Book;

@Service
public class BookService {
	
	
	
	@Autowired
	private Book book;         //dependency injection
	
	
	
	public List<Book> allBooks() {
	    List<Book> b = Arrays.asList(
	        new Book("Harry Potter", 500.0, "J.K.ROWLING", 1999, 6.6, 390),
	        new Book("Mrtunjya", 460.0, "Shivaji Sawant", 2011, 7.6, 703),
	        new Book("Vyakti ani Valli", 670.0, "P.L.Deshpande", 2000, 9.0, 890),
	        new Book("Wings of Fire", 500.0, "A.P.J.Abdul Kalam", 1999, 9.0, 420),
	        new Book("Harry Potter2", 650.0, "J.K.ROWLING", 2009, 6.6, 590),
	        new Book("Ti phulrani", 670.0, "P.L.Deshpande", 2001, 9.0, 740),
	        new Book("Mahabharata", 1000.0, "Ved Vyasa", 400, 9.0, 570),
	        new Book("Batatyachi Chal", 450.0, "P.L.Deshpande", 1960, 8.5, 370),
	        new Book("Yayati", 420.0, "V.S.Khandekar", 1959, 8.9, 400),
	        new Book("The Power of your subconscious mind", 420.0, "Joseph murphy", 2020, 8.9, 400)
	    );
	    return b;
	}

	
	
    public List<Book> allDetails() {
    	
    	return allBooks();
    }
    
    
	
	// search books by its name
	public List<Book> searchBook(String name){
		
		List<Book> book = allBooks();
		
		return book.stream()
				.filter((i)-> i.getName()
				.equalsIgnoreCase(name))
				.collect(Collectors.toList());		
	}
	
	
	
	// search book by author name
	public List<Book> searchbyAuthor(String author){
		List<Book> book = allBooks();
		
		return  book.stream()
				.filter((i)-> i.getAuthor()
				.toLowerCase()
				.contains(author))
				.collect(Collectors.toList());
	}
	
	
//	public List<Book> sortbyPrice(){
//		
//		List <Book> book = allBooks();
//		
//		return   book.stream()
//		        .sorted(Comparator.comparingDouble(price))
//		        .collect(Collectors.toList());
//		
//	}
	
	
	
	
public String addNewBook(String name, String author, double price, double rating, int publishyear, int pages) {
		
		List<Book> list= new ArrayList(allBooks());
		
		Book book = new Book();
		book.setName(name);
		book.setAuthor(author);
		book.setPrice(price);
		book.setRating(rating);
		book.setPublishyear(publishyear);
		book.setPages(pages);
		list .add(book);
		return book.getName()+" New Book added sucessfully";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
