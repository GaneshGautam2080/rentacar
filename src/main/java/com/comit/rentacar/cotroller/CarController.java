package com.comit.rentacar.cotroller;


import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.comit.rentacar.bean.CarBean;
import com.comit.rentacar.service.CarService;
import com.comit.rentacar.util.Util;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class CarController {
		
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CarService carService;
	
	@GetMapping ("/")
	public String index() {
	logger.debug("Landing Page");
	return "index";
	}
	
	@GetMapping("/list")
	public ModelAndView list() {
	logger.debug("Listing Car");
	List<CarBean> cars = this.carService.listCars();
	return new ModelAndView("list", "cars", cars);
	}

	@GetMapping("/create")
	public String showCreate() {
	logger.debug("Show Create");
	return "create";
	}
	
	@PostMapping("/create")
	public String createCar(HttpServletRequest req) {
		logger.debug("Create Car");
		String carid = req.getParameter("id");
		String brand = req.getParameter("brand");
		String model = req.getParameter("model");
		String year = req.getParameter("year");
		String km = req.getParameter("km");
		
		CarBean car = this.createCarBean(carid,brand,model,year,km);
		this.carService.createCar(car);
		return "redirect:/list";
	}
	@GetMapping("/update/{id}")
	public ModelAndView showUpdate(@PathVariable int id) {
		logger.debug("Show Update");
		CarBean car = this.carService.findCar(id);
		return new ModelAndView("update","car",car);
	}
	@PostMapping("/update")
	public String updateCar(HttpServletRequest req) {
		logger.debug("Update Car");
		
		String carid = req.getParameter("id");
		String brand = req.getParameter("brand");
		String model = req.getParameter("model");
		String year = req.getParameter("year");
		String km = req.getParameter("km");
	
		CarBean car = this.createCarBean(carid, brand, model, year, km);
		this.carService.updateCar(car);
		return "redirect:/list";
	}
		
		@GetMapping("/delete/{id}")
		public String deleteCar(@PathVariable int id){
		logger.debug("Delete Car");
		this.carService.deleteCar(id);
		return "redirect:/list";
		
	}
	
	private CarBean createCarBean(String id, String brand, String model, String year, String km) {
	CarBean car = new CarBean(Util.parseId(id),brand,model,Util.parseYear(year),Util.parseKm(km));
	return car;
	}
	
	@GetMapping("/create2")
	public String showCreate2() {
	logger.debug("Show Create2");
	return "create2";
	}
	
	
	@GetMapping("/customer")
	public String customer() {
	return "customer"; 
	}
	@GetMapping("/rent")
	public String rent() {
	return "rent"; 
	}
	@GetMapping("/back")
	public String back() {
	return "back"; 
	}
	@GetMapping("/payment")
	public String payment() {
	return "payment"; 
	}


	
}
