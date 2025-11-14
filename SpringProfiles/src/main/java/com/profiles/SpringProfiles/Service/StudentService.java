package com.profiles.SpringProfiles.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profiles.SpringProfiles.Entity.Student;
import com.profiles.SpringProfiles.Repository.StudentRepos;

@Service
public class StudentService {
	
	
	
	@Autowired
	private StudentRepos repos;
	
	
	public Student addStudentDetail(Student student){
			
			Student studentdata =   repos.save(student);
			
			return studentdata;
			   
		}
		
	
		public List<Student> getAllStudentDetails() {
			
				return repos.findAll();
				
		}
	

}
