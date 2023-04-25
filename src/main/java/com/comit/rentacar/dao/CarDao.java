package com.comit.rentacar.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.comit.rentacar.bean.CarBean;

@Repository
public class CarDao {

	List<CarBean> cars;
	
	public CarDao() {
		this.cars = new ArrayList <CarBean>();
		CarBean cars= new CarBean(1001,"Honda", "CRV", "2022", "15000");
		
				
	}
	
	
}
