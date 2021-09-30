package com.example.flightBooking;

public class Flight {
	public Flight(int flightId, String flightName) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
	}
	
	private int flightId;
	private String flightName;
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
}
