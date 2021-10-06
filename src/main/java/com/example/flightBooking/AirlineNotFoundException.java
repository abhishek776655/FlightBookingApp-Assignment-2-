package com.example.flightBooking;

public class AirlineNotFoundException extends RuntimeException {
AirlineNotFoundException(String message){
	super(message);
}
}
