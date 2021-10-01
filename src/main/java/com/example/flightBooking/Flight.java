package com.example.flightBooking;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer flightId;
	
	private String flightName;
	private Airline airline;
	private City fromPlace;
	private City destination;
	private Date takeOffTime;
	private Date landingTime;
	private int businessSeats;
	private int nonBusinessSeats;
	private float ticketCost;
	private int noOfRows;
	
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	public City getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(City fromPlace) {
		this.fromPlace = fromPlace;
	}
	public Date getTakeOffTime() {
		return takeOffTime;
	}
	public void setTakeOffTime(Date takeOffTime) {
		this.takeOffTime = takeOffTime;
	}
	public Date getLandingTime() {
		return landingTime;
	}
	public void setLandingTime(Date landingTime) {
		this.landingTime = landingTime;
	}
	public int getBusinessSeats() {
		return businessSeats;
	}
	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}
	public int getNonBusinessSeats() {
		return nonBusinessSeats;
	}
	public void setNonBusinessSeats(int nonBusinessSeats) {
		this.nonBusinessSeats = nonBusinessSeats;
	}
	public float getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(float ticketCost) {
		this.ticketCost = ticketCost;
	}
	public int getNoOfRows() {
		return noOfRows;
	}
	public void setNoOfRows(int noOfRows) {
		this.noOfRows = noOfRows;
	}
	public City getDestination() {
		return destination;
	}
	public void setDestination(City destination) {
		this.destination = destination;
	}
	
}
