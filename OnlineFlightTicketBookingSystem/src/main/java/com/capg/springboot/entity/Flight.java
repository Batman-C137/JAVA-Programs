package com.capg.springboot.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="flight")
public class Flight {
	
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	private int flight_id;
	@Column(name = "departure")
	private String departureLocation;
	@Column(name = "arrival")
	private String arrivalLocation;
	@Column(name = "departuret")
	private Date departureTime=new Date();
	@Column(name = "arrivalt")
	private Date arrivalTime =new Date();
	
	@OneToOne(mappedBy = "flight",fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private Booking booking;
	
	/*@OneToOne
    @JoinColumn(name="booking_id")
	private Booking booking;*/
	
	@OneToOne
    @JoinColumn(name="location_id")
	private Location location;
	
	@OneToOne
    @JoinColumn(name="fleet_id")
	private Fleet fleet;
	
	public int getId() {
		return flight_id;
	}
	
	public void setId(int id) {
		this.flight_id=id;
	}
	public String getDepartureLocation() {
		return departureLocation;
	}
	public void setDepartureLocation(String departureLocation)
	{
		this.departureLocation=departureLocation;
	}
	
	public String getArrivalLocation()
	{
		return arrivalLocation;
	}
	public void setArrivalLocation(String arrivalLocation)
	{
		this.arrivalLocation=arrivalLocation;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime)
	{
		this.departureTime=departureTime;
	}
	
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime)
	{
		this.arrivalTime=arrivalTime;
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(int id, String departureLocation, String arrivalLocation, Date departureTime,Date arrivalTime) {
		super();
		this.flight_id = id;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.departureTime = departureTime;
		this.arrivalTime=arrivalTime;
		
	}

	@Override
	public String toString() {
		return "Flight [id=" + flight_id + ", departureLocation=" + departureLocation + ", arrivalLocation=" + arrivalLocation
				+ ", fleet=" + fleet + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + "]";
	}
	
	
	

}