package com.model.model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class Ceo {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int cid;

	
	 private String cname;
	 private String email;
	 
	 
	 
	 @OneToOne(mappedBy = "ceo")
	 private Company company;



	public int getCid() {
		return cid;
	}



	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Company getCompany() {
		return company;
	}



	public void setCompany(Company company) {
		this.company = company;
	}



	
	 
 
	 

//	 @OneToMany(cascade = CascadeType.ALL)
//	 private List<Experience> experiences;

	 
	 
	 
	
	
	
	
	
	
	
	

//	public List<Experience> getExperiences() {
//		return experiences;
//	}
//
//	public void setExperiences(List<Experience> experiences) {
//		this.experiences = experiences;
//	}
	 
	 


}
