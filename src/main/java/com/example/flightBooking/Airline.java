package com.example.flightBooking;

public class Airline {
	public Airline(String airlineName, int id, String country) {
		super();
		this.airlineName = airlineName;
		this.id = id;
		this.country = country;
	}
	private String airlineName;
	private int id;
	private String country;
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
