package com.example.flightBooking;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/flight")
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	@PostMapping("/booking/{flightId}")
	int bookingFlight(@PathVariable int flightId,@RequestBody Ticket ticket ) {
		try {
			return ticketService.addTicket(ticket,flightId);
		} catch (Exception e) {
			return -1;
		}	
	}
	
	@GetMapping("/booking/history/{emailId}")
	List<Ticket> getTicketsHistory(@PathVariable String emailId) {
		return ticketService.getTicketsHistory(emailId);
	}

	@GetMapping("/ticket/{pnr}")
	Ticket getBookedTicketsByPnr(@PathVariable int pnr) {
		return ticketService.getTicket(pnr);
	}
	
	@GetMapping("/booking/history/{emailId")
	String getPreviousTickets(@PathVariable int emailId) {
		return "previous booked tickets";
	}
	
	@DeleteMapping("/booking/cancel/{pnr}")
	int cancelTicket(@PathVariable int pnr) {
		 ticketService.cancelTicket(pnr);
		 return pnr;
	}
}
