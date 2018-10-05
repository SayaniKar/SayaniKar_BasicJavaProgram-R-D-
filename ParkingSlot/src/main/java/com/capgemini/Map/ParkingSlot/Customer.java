package com.capgemini.Map.ParkingSlot;

public class Customer {
	String carOwner;
	int parkingTime;
	ParkingID parkingID;
	int phone;
	public Customer(String carOwner, int parkingTime, ParkingID parkingID, int phone) {
		super();
		this.carOwner = carOwner;
		this.parkingTime = parkingTime;
		this.parkingID = parkingID;
		this.phone = phone;
	}
	public String getCarOwner() {
		return carOwner;
	}
	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}
	public int getParkingTime() {
		return parkingTime;
	}
	public void setParkingTime(int parkingTime) {
		this.parkingTime = parkingTime;
	}
	public ParkingID getParkingID() {
		return parkingID;
	}
	
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [carOwner=" + carOwner + ", parkingTime="
				+ parkingTime + ", parkingID=" + parkingID + ", phone=" + phone
				+ "]";
	}
	

}
