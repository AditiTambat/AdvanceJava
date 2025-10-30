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
		
		
		public List<Car> showCar() throws Exception {
		    List<Car> cars = repos.findAll();

		    if (cars.isEmpty()) {
		        throw new Exception("No cars found in the database");
		    } else {
		        return cars;
		    }
		}

}
