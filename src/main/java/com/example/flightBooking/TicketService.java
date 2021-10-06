package com.example.flightBooking;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
	@Autowired
	TicketRepository ticketRepository;
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	UserRepository userRepository;
	
	Ticket getTicket(int pnr) {
		return ticketRepository.findByPnr(pnr);
	}
	
	int addTicket(Ticket ticket,int flightId) {
		Flight flight = flightRepository.getById(flightId);
		User user = userRepository.findByEmail(ticket.getEmail());
	        
			if(flight==null) {
				 System.out.println(ticket);
				throw new RuntimeException("Flight not found");
			}
			else if(user==null) {
				throw new RuntimeException("User not found");
			}
			else {
				Random r = new Random();
				int pnr = 100000 + (int)(r.nextFloat() * 899900);
				ticket.setFlight(flight);
				ticket.setUser(user);
				ticket.setPnr(pnr);				
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
