package com.example.flightBooking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	@Autowired
	FlightRepository repository;
	
	void addFlight(Flight flight) {
		repository.save(flight);
	}
	
	List<Flight> searchFlight(Flight flight) {
		return repository.findByFromPlaceOrDestinationOrTakeOffTimeOrLandingTime(flight.getFromPlace(), flight.getDestination(), flight.getTakeOffTime(), flight.getLandingTime());
	}
}
