package com.example.flightBooking;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
	@Autowired
	TicketRepository ticketRepository;
	
	@Autowired
	FlightRepository flightRepository;
	
	Ticket getTicket(int pnr) {
		return ticketRepository.findByPnr(pnr);
	}
	
	int addTicket(Ticket ticket,int flightId) throws Exception {
		Object flight = flightRepository.findById(flightId);
			if(flight!=null) {
				Random r = new Random();
				int pnr = 100000 + (int)(r.nextFloat() * 899900);
				ticket.setFlight(flight);
				ticket.setPnr(pnr);
			}
			else {
				throw new Exception("Flight not found");
			}
		ticketRepository.save(ticket);
		return ticket.getPnr();
	}
	
	List<Ticket> getTicketsHistory(String emailId) {
		return ticketRepository.findByEmail(emailId);
	}
	
	void cancelTicket(int pnr) {
		 Ticket ticket = ticketRepository.findByPnr(pnr);
		 ticketRepository.delete(ticket);
		
		
	}
	
}
