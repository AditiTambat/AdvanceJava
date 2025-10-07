package com.penguin_publications.Pune_publication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.penguin_publications.Pune_publication.Entity.Author;
import com.penguin_publications.Pune_publication.Repository.AuthorRepos;

@Service
public class AuthorService {
	
	AuthorRepos repo;
	
	public AuthorService(AuthorRepos repo) {  //constructor injection
		this.repo=repo;
	}
	
	
	
	public Author addAuthorDetails(Author author) throws Exception{
		
		if(author==null){
			throw  new Exception ("Invalid author");
		}
		System.out.println("author saving in db");
		Author authordata =   repo.save(author);
		
		System.out.println("author saved in db");
		return authordata;
		   
	}
	
	public List<Author> getAllAuthorDetails() throws Exception{
		
		if(!repo.findAll().isEmpty()){
			return repo.findAll();
		}
		
		throw new Exception ("Something went wrong ");
	}

}
