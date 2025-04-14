package com.cts.SmartHotelBookingSystem.model;

import org.springframework.stereotype.Component;

@Component
public class Hotel {
//	HotelID, Name, Location, ManagerID, Amenities, Rating
	private int hotelID;
	private String name;
	private String location;
	private int managerID;
	private String amenities;
	private double Rating;
	
	public int getHotelID() {
		return hotelID;
	}
	public void setHotelID(int hotelID) {
		this.hotelID = hotelID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getManagerID() {
		return managerID;
	}
	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}
	public String getAmenities() {
		return amenities;
	}
	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}
	public double getRating() {
		return Rating;
	}
	public void setRating(double rating) {
		Rating = rating;
	}
}
