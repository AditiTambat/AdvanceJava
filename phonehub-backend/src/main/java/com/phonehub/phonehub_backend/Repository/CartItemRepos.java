package com.phonehub.phonehub_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phonehub.phonehub_backend.Entity.CartItem;

public interface CartItemRepos extends JpaRepository<CartItem, Integer> {

}
