package com.model.model.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.model.Entity.Car;
import com.model.model.Service.CarService;

@RestController
@RequestMapping("/carcontroller")
public class CarController {
	
	@Autowired
	private CarService service;
	
	
	@PostMapping("/addcar")
	public Car addCar(@RequestBody Car car )  {
	
	     return service.addCarDetail(car);		
	}
	
	
	@GetMapping("/getcar")
	public List<Car> getcar() throws Exception{
		
		return service.showCar();
	}

}
