package com.example.flightBooking;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{
	Ticket findByPnr(int pnr);
	
	List<Ticket> findByEmail(String emailId);
	

}
