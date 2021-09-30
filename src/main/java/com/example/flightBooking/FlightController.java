package com.example.flightBooking;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/flight")
public class FlightController {
	
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
	
	@PostMapping("/airline/inventory/add")
	String addInventory(@RequestBody Flight flight) {
		return "Successfully added";
	}
	
	@PostMapping("/booking/{flightId}")
	String bookingFlight(@PathVariable int flightId) {
		return "Successfully Booked";
	}
	
	@PostMapping("/search")
	String searchFlight(@RequestBody Flight flight) {
		return "results";
	}
	
	@GetMapping("/ticket/{pnr}")
		String getBookedTicketsByPnr(@PathVariable int pnr) {
		return "results";
	}
	
	@GetMapping("/booking/history/{emailId")
		String getPreviousTickets(@PathVariable int emailId) {
		return "previous booked tickets";
	}
	
	@DeleteMapping("/booking/cancel/{pnr}")
		String cancelTicket(@PathVariable int pnr) {
			return "ticket with pnr = "+pnr+ " cancelled";
		}
}
