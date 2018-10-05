package com.capgemini.Map.ParkingSlot;

public class ParkingID {
	
int floor;
int section;

 int compartment_id;
public ParkingID(int floor, int section,int compartment_id) {
	super();
	this.compartment_id=compartment_id;
	this.floor = floor;
	this.section = section;
	
}
public int getFloor() {
	return floor;
}
public void setFloor(int floor) {
	this.floor = floor;
}
public int getSection() {
	return section;
}
public void setSection(int section) {
	this.section = section;
}

public int getCompartment_id() {
	return compartment_id;
}
@Override
public String toString() {
	return "Parking [floor=" + floor + ", section=" + section
			+ ", compartment_id=" + compartment_id + "]";
}





}
