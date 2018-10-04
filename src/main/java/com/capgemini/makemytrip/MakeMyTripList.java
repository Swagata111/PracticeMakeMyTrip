package com.capgemini.makemytrip;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;



public class MakeMyTripList {

	ArrayList<MakeMytripPojo> flightlist=new ArrayList<MakeMytripPojo>();
	
	public void add(MakeMytripPojo ob)
	{
		flightlist.add(ob);
	}

	public void remove(int flightNo)
	{
		for (MakeMytripPojo flight:flightlist)
		{
			if(flight.getFlightId()==flightNo)
				flightlist.remove(flight);
		}	
	}
	
	public void updateBySource(int flightNo,String source)
	{
		for (MakeMytripPojo flight:flightlist)
		{
			if(flight.getFlightId()==flightNo)
				flight.setSource(source);
		}	
	}
	
	public void updateByDestination(int flightNo,String destination)
	{
		for (MakeMytripPojo flight:flightlist)
		{
			if(flight.getFlightId()==flightNo)
				flight.setDestination(destination);
		}	
	}
	
	public void updateByArrivalTime(int flightNo,LocalTime arrTime)
	{
		for (MakeMytripPojo flight:flightlist)
		{
			if(flight.getFlightId()==flightNo)
				flight.setArrivalTime(arrTime);
		}	
	}
	
	public void updateByDepartureTime(int flightNo,LocalTime deptTime)
	{
		for (MakeMytripPojo flight:flightlist)
		{
			if(flight.getFlightId()==flightNo)
				flight.setDepartureTime(deptTime);
		}	
	}
	
	public ArrayList<MakeMytripPojo> getAllFlights()
	{
		return flightlist;
	}

	public ArrayList<MakeMytripPojo> sortFlightByFare()
	{
		flightlist.sort((MakeMytripPojo m1,MakeMytripPojo m2)->m1.getFare().compareTo(m2.getFare()));
		return flightlist;
	}
	
	public ArrayList<MakeMytripPojo> sortByTime()
	{
		flightlist.sort((MakeMytripPojo m1,MakeMytripPojo m2)->m1.getTotalTime().compareTo(m2.getTotalTime()));
		return flightlist;
	}
	
	public ArrayList<MakeMytripPojo> sortByMorningTime()
	{
		ArrayList<MakeMytripPojo> flightlist1=new ArrayList<MakeMytripPojo>();
		for (MakeMytripPojo flight:flightlist)
		{
			if(flight.getDepartureTime().getHour()<6)
				flightlist1.add(flight);
		}
		
		return flightlist1;
	}
	
	
	public static void main(String[] args) 
	{
	MakeMyTripList flist=new MakeMyTripList();
	
	String pattern = "yyyy-MM-dd";
	String pattern1="HH:mm";

	LocalDate fdate = LocalDate.of(2015, Month.JULY, 12);
	LocalTime time1 = LocalTime.of(12,20,25,40);
	LocalTime time2 = LocalTime.of(16,20,25,40);
	LocalTime time3 = LocalTime.of(04,00,00,00);
	LocalTime time4 = LocalTime.of(04,20,25,40);
	LocalTime time5 = LocalTime.of(07,20,25,40);
	LocalTime time6 = LocalTime.of(03,00,00,00);
	//System.out.println(time6.getHour());
	flist.add(new MakeMytripPojo("Indigo","Bangalore","Kolkata",fdate,time2,time1,20000.0,time3));
	flist.add(new MakeMytripPojo("Indigo","Bangalore","Mumbai",fdate,time2,time1,18000.0,time3));
	flist.add(new MakeMytripPojo("Indigo","Bangalore","Chennai",fdate,time5,time4,15000.0,time6));
	System.out.println(flist.getAllFlights().toString());
	flist.updateByDestination(2, "Delhi");
	System.out.println("After updating");
	System.out.println(flist.getAllFlights().toString());
	//flist.remove(2);
	System.out.println("After deleting");
	System.out.println(flist.getAllFlights().toString());
	System.out.println("Sorting By Cheapest Flight");
	System.out.println(flist.sortFlightByFare().toString());
	System.out.println("Sorting By Time");
	System.out.println(flist.sortByTime().toString());
	System.out.println("Morning flights");
	System.out.println(flist.sortByMorningTime().toString());
	
	}

}
