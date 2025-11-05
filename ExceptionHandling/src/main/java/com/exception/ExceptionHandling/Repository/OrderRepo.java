package com.exception.ExceptionHandling.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exception.ExceptionHandling.Entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {

}
