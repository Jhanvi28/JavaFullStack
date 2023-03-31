package com.einfo.demo.model;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Ticket {
	
	@Id
	private String ticketId;
	private String mobileNumber;
	private String movieName;
	private String bookingDate;
	private String showDate;
	private String showTime;
	private String numberOfSeats;
	private String seatType;
	private String paymentType;
	private String transactionId;
	private String status;
	private String paidAmount;
	public Ticket() {
		super();
	}
	public Ticket(String ticketId, String mobileNumber, String movieName, String bookingDate, String showDate,
			String showTime, String numberOfSeats, String seatType, String paymentType, String transactionId,
			String status, String paidAmount) {
		super();
		this.ticketId = ticketId;
		this.mobileNumber = mobileNumber;
		this.movieName = movieName;
		this.bookingDate = bookingDate;
		this.showDate = showDate;
		this.showTime = showTime;
		this.numberOfSeats = numberOfSeats;
		this.seatType = seatType;
		this.paymentType = paymentType;
		this.transactionId = transactionId;
		this.status = status;
		this.paidAmount = paidAmount;
	}
	
	public Ticket(String mobileNumber, String movieName, String bookingDate, String showDate,
			String showTime, String numberOfSeats, String seatType, String paymentType, String transactionId,
			String status, String paidAmount) {
		super();
		this.mobileNumber = mobileNumber;
		this.movieName = movieName;
		this.bookingDate = bookingDate;
		this.showDate = showDate;
		this.showTime = showTime;
		this.numberOfSeats = numberOfSeats;
		this.seatType = seatType;
		this.paymentType = paymentType;
		this.transactionId = transactionId;
		this.status = status;
		this.paidAmount = paidAmount;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getShowDate() {
		return showDate;
	}
	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public String getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(String numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", mobileNumber=" + mobileNumber + ", movieName=" + movieName
				+ ", bookingDate=" + bookingDate + ", showDate=" + showDate + ", showTime=" + showTime
				+ ", numberOfSeats=" + numberOfSeats + ", seatType=" + seatType + ", paymentType=" + paymentType
				+ ", transactionId=" + transactionId + ", status=" + status + ", paidAmount=" + paidAmount + "]";
	}
	
}
