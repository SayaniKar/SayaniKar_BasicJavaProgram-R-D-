package com.capgemini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class FlightService {
	ArrayList<FlightPojo>FlightList=new ArrayList<FlightPojo>();
	public  void addFlightDetails(FlightPojo flight)
	{
		
		FlightList.add(flight);
		
	}
	public  ArrayList<FlightPojo> getFlightDetails()
	{
		return FlightList;
	}
	public  FlightPojo getFlightDetailsByFlightNo(int flightNo)
	{
		for(FlightPojo flight:FlightList)
		{
			if(flight.getFlightNo()==flightNo)
				return flight;
		}
		throw new RuntimeException("Flight No. does not exists");	
	}
	public  ArrayList<FlightPojo> removeFlightDetails(int flightNo)
	{
		for(FlightPojo flight:FlightList)
		{
			if(flight.getFlightNo()==flightNo)
			{
				FlightList.remove(flight);
				return FlightList;
			}
		}
		throw new RuntimeException("Flight No. does not exists");	
	}
	public ArrayList<FlightPojo> updateFlightDetailsByArrivalDeparture(int flightNo,int arrivalTime,int deptaureTime)
	{
		for(FlightPojo flight:FlightList)
		{
			if(flight.getFlightNo()==flightNo)
			{
				flight.setArrivalTime(arrivalTime);
				flight.setDeptaureTime(deptaureTime);
				return FlightList;
			}
		}
		throw new RuntimeException("Flight No. does not exists");
}
	public ArrayList<FlightPojo> updateFlightDetailsByDestination(int flightNo,String destination)
	{
		for(FlightPojo flight:FlightList)
		{
			if(flight.getFlightNo()==flightNo)
			{
				flight.setDestination(destination);
				return FlightList;
			}
		}
		throw new RuntimeException("Flight No. does not exists");
}
	public  ArrayList<FlightPojo> sortByCost(String origin,String destination)
	{
		FlightList.sort(Comparator.comparingDouble(FlightPojo::getCost));
		ArrayList<FlightPojo> flights=new ArrayList<FlightPojo>();
		for(FlightPojo flight:FlightList)
		{
			if(flight.getOrigin().equals(origin) && flight.getDestination().equals(destination))
				flights.add(flight);
		}
		if(!flights.isEmpty())
			return flights;
		
			throw new RuntimeException("No such flights");
		
}
	public  ArrayList<FlightPojo> sortByRouteTime(String origin,String destination)
	{
		FlightList.sort((flight1,flight2)->flight1.getRouteTime()-flight2.getRouteTime());
		ArrayList<FlightPojo> flights=new ArrayList<FlightPojo>();
		for(FlightPojo flight:FlightList)
		{
			if(flight.getOrigin().equals(origin) && flight.getDestination().equals(destination))
				flights.add(flight);
		}
		if(!flights.isEmpty())
			return flights;
			
		throw new RuntimeException("No such flights");
		
}
	public  ArrayList<FlightPojo> sortByMorningFlights(String origin,String destination)
	{

		ArrayList<FlightPojo> flights=new ArrayList<FlightPojo>();
		for(FlightPojo flight:FlightList)
		{
			if(flight.getOrigin().equals(origin) && flight.getDestination().equals(destination)
					&& flight.getDeptaureTime()>=6 && flight.getDeptaureTime()<=12)
				flights.add(flight);
		}
		if(!flights.isEmpty())
		{
			return flights;
		}
	
				throw new RuntimeException("No such flights");
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		FlightService flight=new FlightService();
		flight.addFlightDetails(new FlightPojo("Air India",7,10,5000,"Bangalore","Kolkata"));
		flight.addFlightDetails(new FlightPojo("Spice Jet",13,15,6500,"Mumbai","Kolkata"));
		flight.addFlightDetails(new FlightPojo("Spice Jet",14,17,6000,"Mumbai","Kolkata"));
		flight.addFlightDetails(new FlightPojo("Indigo",11,14,7000,"Chennai","Kolkata"));

		

			
		
      System.out.println("List of flights:");
		for(FlightPojo flight1:flight.getFlightDetails())
			System.out.println(flight1);
	
		
		System.out.println("\nUpdate destination:");
		for(FlightPojo flight2:flight.updateFlightDetailsByDestination(2, "Bangalore"))
			System.out.println(flight2);
	
		
		System.out.println("\nUpdate Time:");
		for(FlightPojo flight3:flight.updateFlightDetailsByArrivalDeparture(2,1000, 700))
			System.out.println(flight3);
	
	
		System.out.println("\nDeletion:");
		for(FlightPojo flight4:flight.removeFlightDetails(2))
			System.out.println(flight4);
	
		
		System.out.println("\nSorting by Cost:");
		for(FlightPojo flight5:flight.sortByCost("Mumbai", "Kolkata"))
			System.out.println(flight5);
	

		System.out.println("\nSorting by Duration:");
		for(FlightPojo f:flight.sortByRouteTime("Mumbai", "Kolkata"))
			System.out.println(f);
	
		
		System.out.println("\nSorting by Morning flights:");
		for(FlightPojo flight6:flight.sortByMorningFlights("Mumbai", "Kolkata"))
			System.out.println(flight6);
	
			
			
		//System.out.println("No other Methods are Available");
		
		
		
		

	}


	}

	

