package com.example.flightBooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
	@Autowired
	FlightRepository repository;
	
	void addFlight(Flight flight) {
		repository.save(flight);
	}
}
