package com.comit.rentacar.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.comit.rentacar.bean.CarBean;
import com.comit.rentacar.dao.mapper.CarMapper;

@Repository 
public class CarDao {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	
	@Autowired 
	JdbcTemplate jdbcTemplate;
	
	
	public List <CarBean> listCars() {
		String sql= "SELECT * FROM LIST";
		
		return jdbcTemplate.query(sql, new CarMapper());
		}
	
	public void createCar(CarBean car) {
		
		String sql= "INSERT INTO LIST(CARID, BRAND, MODEL, YEAR, KM) "
				+ "VALUES(?,?,?,?,?)";
	
		this.jdbcTemplate.update(sql, car.getCarid(), car.getBrand(),car.getModel(), car.getYear(), car.getKm());			
			
	}
		public CarBean findCar(int carid) {
		String sql = "SELECT * FROM LIST WHERE CARID = ?";
		return this.jdbcTemplate.queryForObject(sql, new CarMapper(), carid);
	}
		public void updateCar(CarBean car) {
		String sql = "UPDATE LIST SET BRAND = ?, MODEL = ?, YEAR = ?, KM = ?";
		int status = this.jdbcTemplate.update(sql, car.getBrand(), car.getModel(), car.getYear(), car.getKm());
		
		if (status == 0) {
			logger.error("Error while updating car: ", car);
		}
		}
		
		public void deleteCar(int carid) {
		String sql = "DELETE FROM LIST WHERE CARID = ?";
		int status = this.jdbcTemplate.update(sql, carid);
		if (status == 0) {
			logger.error("Error while updaring user: ", carid);
		}
		
	}
	}