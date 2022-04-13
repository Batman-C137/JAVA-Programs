package com.capg.springboot.entity;

import javax.persistence.*;


@Entity
@Table(name="booking")
public class Booking {
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	private int booking_id;
	@Column(name = "number")
	private long bookingNumber;
	@Column(name = "date")
	private int bookingDate;
	@Column(name = "tdate")
	private int travelDate;
	@Column(name = "cost")
	private double totalCost;
	
	@OneToOne
    @JoinColumn(name="flight_id")
	private Flight flight;
	
	
	@OneToOne(mappedBy = "booking",fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private User user; 
	
	/*@OneToOne
    @JoinColumn(name="user_id")
	private User user;*/
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int id, long bookingNumber, int bookingDate, int travelDate, double totalCost) {
		super();
		booking_id = id;
		this.bookingNumber = bookingNumber;
		this.bookingDate = bookingDate;
		this.travelDate = travelDate;
		this.totalCost = totalCost;
	}
	public int getId() {
		return booking_id;
	}
	public void setId(int id) {
		booking_id = id;
	}
	public long getBookingNumber() {
		return bookingNumber;
	}
	public void setBookingNumber(long bookingNumber) {
		this.bookingNumber = bookingNumber;
	}
	public int getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(int bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(int travelDate) {
		this.travelDate = travelDate;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	@Override
	public String toString() {
		return "Booking [Id=" + booking_id + ", bookingNumber=" + bookingNumber + ", bookingDate=" + bookingDate
				+ ", travelDate=" + travelDate + ", totalCost=" + totalCost + ", user=" + user + "]";
	}
	
	
	

}