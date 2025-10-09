package com.dto.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.demo.Entity.Movie;

public interface MovieRepos extends JpaRepository<Movie, Integer> {

}
