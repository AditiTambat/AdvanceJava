package com.model.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.model.Entity.Ceo;
import com.model.model.Repository.CeoRepos;

@Service
public class CeoService {
	
	
	@Autowired
	private CeoRepos repos;
	
	
	public Ceo addCeoDetails(Ceo ceo) {
		return repos.save(ceo);
	}
	
	public List<Ceo> getAllCeo() throws Exception {
	   List<Ceo> list = repos.findAll();
		 if (list.isEmpty()) {
		   throw new Exception("No CEO records found");
		 }
		return list;
	 }

}
