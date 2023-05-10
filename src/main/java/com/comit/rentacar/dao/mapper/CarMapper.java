package com.comit.rentacar.dao.mapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comit.rentacar.bean.CarBean;

public class CarMapper implements RowMapper<CarBean> {

	@Override
	public CarBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		CarBean car = new CarBean();
		
		car.setCarid(rs.getInt("CARID"));
		car.setBrand(rs.getString("BRAND"));
		car.setModel(rs.getString("MODEL"));
		car.setYear(rs.getInt("YEAR"));
		car.setKm(rs.getInt("KM"));
		
		return car;
	}

}
