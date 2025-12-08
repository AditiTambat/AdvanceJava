package com.phonehub.phonehub_backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonehub.phonehub_backend.Entity.User;
import com.phonehub.phonehub_backend.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	
	
	public User addUserDetails(User user) throws Exception{
			
			if(user==null){
				throw  new Exception ("Invalid User");
			}
			User userdata =   repo.save(user);
			return userdata;
			   
		}
	
	public List<User> getAllUserDetails() throws Exception{
			if(!repo.findAll().isEmpty()){
	
				return repo.findAll();
			}
			throw new Exception ("Something went wrong ");
	}
	
	
	
	 

}
