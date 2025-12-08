package com.phonehub.phonehub_backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonehub.phonehub_backend.Entity.Phone;
import com.phonehub.phonehub_backend.Repository.PhoneRepository;

@Service
public class PhoneService {
	
	
	@Autowired
	private PhoneRepository repo;
	
	
	public Phone addPhoneDetails(Phone phone) throws Exception{
		
		if(phone==null){
			throw  new Exception ("Invalid User");
		}
		Phone phonedata =   repo.save(phone);
		return phonedata;
		   
	}

	public List<Phone> getAllPhoneDetails() throws Exception{
			if(!repo.findAll().isEmpty()){
	
				return repo.findAll();
			}
			throw new Exception ("Something went wrong ");
	}


}
