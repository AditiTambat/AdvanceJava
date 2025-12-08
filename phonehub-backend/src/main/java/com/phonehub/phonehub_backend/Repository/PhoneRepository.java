package com.phonehub.phonehub_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phonehub.phonehub_backend.Entity.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Integer> {

}
