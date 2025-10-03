package com.penguin_publications.Pune_publication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.penguin_publications.Pune_publication.Entity.Book;

@Repository
public interface BookRepos extends JpaRepository<Book,Integer> {
                // two parameter -> class , datatype of primary key i.e. @Id
}
