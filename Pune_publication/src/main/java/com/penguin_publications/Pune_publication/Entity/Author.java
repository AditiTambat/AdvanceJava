package com.penguin_publications.Pune_publication.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int authorId;
	
	@Column(nullable=false)
	private String authorName;
	
	private String email;
	
	
	@JoinColumn
	@OneToMany
	private List<Book> books;




	public Author() {
		super();
	}

	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Author(int authorId, String authorName, String email, List<Book> books) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.email = email;
		this.books = books;
	}


	



	public int getAuthorId() {
		return authorId;
	}




	public String getAuthorName() {
		return authorName;
	}



	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	
	
	
	
	
	
}
