package com.example.flightBooking;

public class FlightNotFoundException extends RuntimeException {
	FlightNotFoundException(String message){
		super(message);
	}

}
