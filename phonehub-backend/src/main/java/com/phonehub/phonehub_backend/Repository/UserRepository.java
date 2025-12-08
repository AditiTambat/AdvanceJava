package com.phonehub.phonehub_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phonehub.phonehub_backend.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
