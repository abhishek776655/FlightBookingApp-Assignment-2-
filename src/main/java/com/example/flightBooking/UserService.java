package com.example.flightBooking;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	FlightRepository repository;
	@Autowired
	TicketRepository ticketRepository;
	
	List<Flight> searchFlight(Flight flight) {
		return repository.findByFromPlaceOrDesignationOrTakeOffTimeOrLandingTime(flight.getFromPlace(), flight.getDesignation(), flight.getTakeOffTime(), flight.getLandingTime());
	}
	
	Ticket getTicket(int pnr) {
		return ticketRepository.findByPnr(pnr);
	}
	
	void addTicket(Ticket ticket,int flightId) {
		Random r = new Random();
		int pnr = 100000 + (int)(r.nextFloat() * 899900);
		ticket.setFlightId(flightId);
		ticket.setPnr(pnr);
		ticketRepository.save(ticket);
	}
	
}
