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
	@PostMapping("/airline/register")
	String registerAirline(@RequestBody Airline airline) {
		System.out.println(airline);
		return "Successfully Booked Airline";
	}
	
	@PostMapping("/admin/login")
	String adminLogin(@RequestBody AdminLogin details) {
		System.out.print(details);
		return "Successfully Logged In";
	}
	
	@PostMapping("/search")
	List<Flight> searchFlight(@RequestBody Flight flight) {
		return flightService.searchFlight(flight);
	}
	
	@PostMapping("/airline/inventory/add")
	String addInventory(@RequestBody Flight flight) {
		flightService.addFlight(flight);
		return "Successfully added";
	}
	
}
