package com.cts.SmartHotelBookingSystem.model;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class Booking {
private int bookingId;
private int userId;
private int roomId;
private Date checkInDate;
private Date checkOutDate;
private String status;
private int paymentId;
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getRoomId() {
	return roomId;
}
public void setRoomId(int roomId) {
	this.roomId = roomId;
}
public Date getCheckInDate() {
	return checkInDate;
}
public void setCheckInDate(Date checkInDate) {
	this.checkInDate = checkInDate;
}
public Date getCheckOutDate() {
	return checkOutDate;
}
public void setCheckOutDate(Date checkOutDate) {
	this.checkOutDate = checkOutDate;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}

}
