package com.capgemini.makemytrip;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class MakeMytripPojo
{
  int flightId;
  String flightCompany;
  String source;
  String destination;
  LocalDate flightDate;
  LocalTime arrivalTime;
  LocalTime departureTime;
  Double fare;
  LocalTime totalTime;
	
	static int autoflightIdGen;
	{
		flightId=++autoflightIdGen;
	}
	

	public MakeMytripPojo(String flightCompany, String source, String destination, LocalDate flightDate,  LocalTime arrivalTime,
			 LocalTime departureTime, Double fare,LocalTime totalTime) {
		super();
		this.flightCompany = flightCompany;
		this.source = source;
		this.destination = destination;
		this.flightDate = flightDate;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.fare = fare;
		this.totalTime=totalTime;
		
	}
	
	
	
	
	public LocalTime getTotalTime() {
		return totalTime;
	}




	public void setTotalTime(LocalTime totalTime) {
		this.totalTime = totalTime;
	}




	public int getFlightId() {
		return flightId;
	}
	
	public String getFlightCompany() {
		return flightCompany;
	}
	public void setFlightCompany(String flightCompany) {
		this.flightCompany = flightCompany;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}
	public  LocalTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime( LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public  LocalTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime( LocalTime departureTime) {
		this.departureTime = departureTime;
	}
	public Double getFare() {
		return fare;
	}
	@Override
	public String toString() {
		return "MakeMytripPojo [flightId=" + flightId + ", flightCompany=" + flightCompany + ", source=" + source
				+ ", destination=" + destination + ", flightDate=" + flightDate + ", arrivalTime=" + arrivalTime
				+ ", departureTime=" + departureTime + ", fare=" + fare + ", totalTime=" + totalTime + "]";
	}
  
}
