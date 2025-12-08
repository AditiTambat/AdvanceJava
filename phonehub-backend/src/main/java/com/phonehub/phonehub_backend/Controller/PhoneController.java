package com.phonehub.phonehub_backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonehub.phonehub_backend.Entity.Phone;
import com.phonehub.phonehub_backend.Service.PhoneService;

@RestController
@RequestMapping("/phonecontroller")
public class PhoneController {
	
	@Autowired
	private PhoneService service;
	
	@PostMapping("/addphone")
	public Phone addPhone(@RequestBody Phone phone) throws Exception {
	     return service.addPhoneDetails(phone);		
	}
	
	
	@GetMapping("/getallphone")
	public List<Phone> getAllUser() throws Exception{
		return service.getAllPhoneDetails();
	}


}
