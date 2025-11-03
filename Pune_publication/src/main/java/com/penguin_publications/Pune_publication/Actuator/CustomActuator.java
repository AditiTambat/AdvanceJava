package com.penguin_publications.Pune_publication.Actuator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import com.penguin_publications.Pune_publication.service.AuthorService;

@Component
@Endpoint(id="authorinfo")
public class CustomActuator {
	
	@Autowired
	private AuthorService service;

	@ReadOperation  //getmapping
	public Map<String,Integer>authorsize() throws Exception{
		int size = service.getAllAuthorDetails().size();
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("total size",size);
		
		return map;
	}
	
	
	@WriteOperation //postmapping
	public String adddata(String name) { // take values in json body
		return name;
	}
	
	
	@WriteOperation //postmapping
	public String adddatamore(@Selector String name,@Selector String lastname) {
		String fullname = name+" "+lastname;   // incase of @selector take value in url
		return fullname;
	}
	
}