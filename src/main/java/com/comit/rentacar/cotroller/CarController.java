package com.comit.rentacar.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

	@GetMapping ("/")
	public String index() {
		return "index";
			
	}
	@GetMapping("/list")
	public String list() {
		return "list";
		
	}
}
