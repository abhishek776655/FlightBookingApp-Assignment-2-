package com.example.flightBooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineService {
	@Autowired
	AirlineRepository repository;
	
	Airline addAirline(Airline airline) {
		return repository.save(airline);
	}
}
