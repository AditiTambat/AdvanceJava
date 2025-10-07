package com.penguin_publications.Pune_publication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.penguin_publications.Pune_publication.Entity.Author;

public interface AuthorRepos extends JpaRepository<Author, Integer> {

}
