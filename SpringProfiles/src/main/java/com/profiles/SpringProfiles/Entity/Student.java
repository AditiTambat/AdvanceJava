package com.profiles.SpringProfiles.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int id;
	
	private String name;
	
	private String email;

}
