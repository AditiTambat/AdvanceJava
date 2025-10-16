package com.model.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.model.Entity.Company;
import com.model.model.Repository.CompanyRepos;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepos repos;
	
	
	public Company addCompanyDetail(Company company) {
		
		return repos.save(company);
	}
	
	
	public List<Company> showCompany(){
		return repos.findAll();
	}

}
