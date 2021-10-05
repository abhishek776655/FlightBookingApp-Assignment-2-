package com.example.flightBooking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	@Autowired
	FlightRepository repository;
	
	@Autowired
	AirlineRepository airlineRepository;
	
	void addFlight(Flight flight) throws Exception {
		Airline airline = airlineRepository.findByName(flight.getAirline().getName());
		if(airline!=null) {
			flight.setAirline(airline);
			repository.save(flight);
		}
		else {
			throw new Exception("Incorrect Airline");
		}
		
	}
	
	List<Flight> searchFlight(Flight flight) {
		return repository.findByFromPlaceOrDestinationOrTakeOffTimeOrLandingTime(flight.getFromPlace(), flight.getDestination(), flight.getTakeOffTime(), flight.getLandingTime());
	}
}
