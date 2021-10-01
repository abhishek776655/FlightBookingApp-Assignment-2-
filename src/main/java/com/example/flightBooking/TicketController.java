package com.example.flightBooking;


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
	String bookingFlight(@PathVariable int flightId,@RequestBody Ticket ticket ) {
		ticketService.addTicket(ticket,flightId);
		return "Successfully Booked";
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
		String cancelTicket(@PathVariable int pnr) {
			return "ticket with pnr = "+pnr+ " cancelled";
		}
}
