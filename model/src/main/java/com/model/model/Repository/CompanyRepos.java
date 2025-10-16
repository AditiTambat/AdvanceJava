package com.model.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.model.Entity.Company;

public interface CompanyRepos extends JpaRepository<Company, Integer> {

}
