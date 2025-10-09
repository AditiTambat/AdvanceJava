package com.dto.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.demo.Entity.Actor;

public interface ActorRepos extends JpaRepository<Actor, Integer> {

}
