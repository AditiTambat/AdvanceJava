package com.model.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.model.Entity.Car;
import com.model.model.Repository.CarRepos;

@Service
public class CarService {

		@Autowired
		private CarRepos repos;
		
		
		public Car addCarDetail(Car car) {
			
			return repos.save(car);
		}
		
		
		public List<Car> showCar(){
			return repos.findAll();
		}
}
