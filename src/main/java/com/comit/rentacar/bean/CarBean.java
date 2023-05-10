package com.comit.rentacar.bean;

public class CarBean {
	
	int carid;
	String brand;
	String model;
	int year;
	int km;
	
	public CarBean() {
	}
	
	public CarBean(int carid, String brand, String model, int year, int km) {
		super();
		this.carid = carid;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.km = km;
	}
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
		}
	@Override
	public String toString() {
		return String.format(
				"CarBean [carid=%s, brand=%s, model=%s, year=%s, km=%s]", 
				carid, brand, model, year, km);
	}
	
	}
	
	
