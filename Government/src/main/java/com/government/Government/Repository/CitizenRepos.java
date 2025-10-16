package com.government.Government.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.government.Government.Entity.Citizen;

public interface CitizenRepos extends JpaRepository<Citizen, Integer> {

}
