package com.model.model.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.model.Entity.Ceo;
import com.model.model.Service.CeoService;

@RestController
@RequestMapping("/ceocontroller")
public class CeoController {
	
	@Autowired
	private CeoService service;
	
	
	@PostMapping("/addceo")
	public Ceo addCeo(@RequestBody Ceo ceo) {
		return service.addCeoDetails(ceo);
	}
	
	
	@GetMapping("/getceo")
	public List<Ceo> getCeo() throws Exception{
		return service.getAllCeo();
	}

}
