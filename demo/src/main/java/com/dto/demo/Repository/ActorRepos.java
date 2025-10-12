package com.dto.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dto.demo.Entity.Actor;

import jakarta.transaction.Transactional;

public interface ActorRepos extends JpaRepository<Actor, Integer> {


	 @Query(value="select * from actor where aname= :name;", nativeQuery=true)
	 public List<Actor>  findByName(@Param("name")String name);
	 
	 
	 
	 @Modifying
	 @Transactional
	 @Query(value="update actor set aname= :nm where aid= :id;", nativeQuery=true)
	 public int  updatebyid(@Param("id") int id, @Param("nm") String name);
}
