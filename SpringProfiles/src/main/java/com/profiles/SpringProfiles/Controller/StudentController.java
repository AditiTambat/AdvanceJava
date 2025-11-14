package com.profiles.SpringProfiles.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profiles.SpringProfiles.Entity.Student;
import com.profiles.SpringProfiles.Service.StudentService;



@RestController
@RequestMapping("/studentcontroller")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student student) {
		
		return service.addStudentDetail(student);
		
	}
	
	

	@GetMapping("/getallstudent")
	@Cacheable("student")
	public List<Student> getAllStudent() throws Exception{
		Thread.sleep(3000);
		System.out.println("from database..");
		return service.getAllStudentDetails();
	}

}
