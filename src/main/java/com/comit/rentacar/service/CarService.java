package com.comit.rentacar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.comit.rentacar.bean.CarBean;
import com.comit.rentacar.dao.CarDao;

@Service
public class CarService {
	
	@Autowired
	CarDao carDao;
	
	public List<CarBean>listCars() {
		
	List<CarBean> cars = this.carDao.listCars();
	return cars;
	}
	
	public void createCar(CarBean car) {
		this.validateCar(car);
		this.carDao.createCar(car);

	}	
		public CarBean findCar(int carid) {
		return this.carDao.findCar(carid);
	}
		
		public void updateCar(CarBean car) {
		this.validateCar(car);
		this.carDao.updateCar(car);
	}
		public void deleteCar(int carid) {
		this.carDao.deleteCar(carid);
		
	}
	

	
	private void validateCar(CarBean car) {
		
		if (car.getBrand().isEmpty() ||
		    car.getModel().isEmpty()) {
			
		throw new RuntimeException("Invaid User Data" + car);
			
		}
		
	}

	
	}

