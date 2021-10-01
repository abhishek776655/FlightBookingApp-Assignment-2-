package com.example.flightBooking;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{
 Ticket findByPnr(int pnr);
}
