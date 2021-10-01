package com.example.flightBooking;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
	List<Flight> findByFromPlaceOrDesignationOrTakeOffTimeOrLandingTime(City fromPlace, City Designation ,Date takeOffTIme, Date landingTime);
}
