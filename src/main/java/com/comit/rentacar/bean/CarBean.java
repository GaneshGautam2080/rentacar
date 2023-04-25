package com.comit.rentacar.bean;

public class CarBean {

	int carid;
	String brand;
	String model;
	int year;
	int seat;
	double km;
	
	

	public CarBean(int carid, String brand, String model, int year, int seat, double km) {
		super();
		this.carid = carid;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.seat = seat;
		this.km = km;
	}
	int getCarid() {
		return carid;
	}

	void setCarid(int carid) {
		this.carid = carid;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}

	int getSeat() {
		return seat;
	}

	void setSeat(int seat) {
		this.seat = seat;
	}

	double getKm() {
		return km;
	}

	void setKm(double km) {
		this.km = km;
	}
	@Override
	public String toString() {
		return "CarBean [carid=" + carid + ", brand=" + brand + ", model=" + model + ", year=" + year + ", seat=" + seat
				+ ", km=" + km + "]";
	}
	
	
	
}
