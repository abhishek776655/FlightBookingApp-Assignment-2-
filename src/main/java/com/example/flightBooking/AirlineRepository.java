package com.example.flightBooking;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineRepository extends JpaRepository<Airline, Integer>  {
	Airline findByName(String name);
}
