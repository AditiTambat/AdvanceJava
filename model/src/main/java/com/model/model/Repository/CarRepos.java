package com.model.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.model.Entity.Car;

public interface CarRepos extends JpaRepository<Car, Integer> {

}
