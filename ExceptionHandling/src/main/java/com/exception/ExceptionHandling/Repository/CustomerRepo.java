package com.exception.ExceptionHandling.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exception.ExceptionHandling.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
