package com.capgemini.Map.ParkingSlot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingSlotImplement {
List<List<Map<ParkingID,Customer>>>Building=new ArrayList();
private int floor=0;
private int section1=0;
int compartment_id;
 public  ParkingSlotImplement()
 {
	 int floorIndex=0;int section=0;
	
	 for(floorIndex=0;floorIndex<4;floorIndex++)
	 {
Building.add(new ArrayList<Map<ParkingID,Customer>>(4));
 }
	 for(floorIndex=0;floorIndex<4;floorIndex++)
	 {
		 for(section=0;section<4;section++)
		 {
			 Building.get(floorIndex).add(new HashMap<ParkingID,Customer>(10));
		 }
	 }
 }




 public ParkingID addCar(Customer customer)
 {
	
	if(Building.get(floor).get(section1).size()==10)
	section1++;
	compartment_id=0;
	if(section1==4)
		floor++;
	if(floor==4)
		throw new RuntimeException("No place to add Extra car");
	ParkingID park=new ParkingID(floor,section1,compartment_id++);
		Building.get(floor).get(section1).put(park,customer);
	return park;
 }
 
public Customer getAllDetails(ParkingID parking)
{
	Customer customer1=Building.get(parking.getFloor()).get(parking.getSection()).get(parking.getCompartment_id());
	return customer1;
}
	public static void main(String args[])
	{ 
		
		Customer cust1=new Customer("aa",3,new ParkingID(1,1,1),91238731);
		
	}

}
