package com.profiles.SpringProfiles.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profiles.SpringProfiles.Entity.Student;
import com.profiles.SpringProfiles.Repository.StudentRepos;

@RestController
@RequestMapping("/studentcontroller")
public class StudentController {
	
	@Autowired
	private StudentRepos repository;
	
	@PostMapping("/addstud")
	public String addStudent(@RequestBody Student student) {
		
		repository.save(student);
		
		return "ok";
		
	}
}
