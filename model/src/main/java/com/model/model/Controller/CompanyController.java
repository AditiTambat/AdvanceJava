package com.model.model.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.model.Entity.Company;
import com.model.model.Service.CompanyService;

@RestController
@RequestMapping("/companycontroller")
public class CompanyController {
	
	@Autowired
	private CompanyService service;
	
	
	@PostMapping("/addcompany")
	public Company addCompany(@RequestBody Company company) {
		
		return service.addCompanyDetail(company);
	}
	
	@GetMapping("/getcompany")
	public List<Company> showCompany(){
		return service.showCompany();
	}

}
