package com.phonehub.phonehub_backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonehub.phonehub_backend.Entity.User;
import com.phonehub.phonehub_backend.Service.UserService;

@RestController
@RequestMapping("/usercontroller")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) throws Exception {
	     return service.addUserDetails(user);		
	}
	
	
	@GetMapping("/getalluser")
	public List<User> getAllUser() throws Exception{
		return service.getAllUserDetails();
	}

}
