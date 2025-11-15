package com.security.RBA.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Carcontroller {
	
	@GetMapping("/get-cars")
	public ResponseEntity<String> getcars(){
		return ResponseEntity.status(HttpStatus.OK).body("all cars fetched");
				
	}
	
	
	@PostMapping("/addcars")
	public ResponseEntity<String> addCar(@RequestParam String carname){
		
		return ResponseEntity.status(HttpStatus.CREATED).body("car added is:"+carname);
	}

}
