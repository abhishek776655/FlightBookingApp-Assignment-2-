package com.example.flightBooking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/flight")
public class FlightController {
	@Autowired
	FlightService flightService;
	
	@Autowired
	AirlineService airlineService;
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/airline/register")
	Airline registerAirline(@RequestBody Airline airline) {
		return airlineService.addAirline(airline);
	}
	
	@PostMapping("/admin/login")
	String adminLogin(@RequestBody Admin admin) {
		try {
			return adminService.login(admin);
		} catch (Exception e) {
			return "Invalid Arguement";
		}
	}
	
	@PostMapping("/admin/register")
	Admin adminRegister(@RequestBody Admin admin) {
		return adminService.createAdmin(admin);
		
	}
	
	@PostMapping("/search")
	List<Flight> searchFlight(@RequestBody Flight flight) {
		return flightService.searchFlight(flight);
	}
	
	@PostMapping("/airline/inventory/add")
	String addInventory(@RequestBody Flight flight)  {
		try {
			flightService.addFlight(flight);
		} catch (Exception e) {
			return "Error";
		}
		return "Successfully added";
		
	
	}
	
}
