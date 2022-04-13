package com.capg.springboot.entity;

import javax.persistence.*;
@Entity
@Table(name="location")
public class Location {
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	private int location_id;
	@Column(name = "name")
	private String name;
	@Column(name = "code")
	private String code;
	@Column(name = "country")
	private String country;
	@Column(name = "airport")
	private String airportName;
	
	@OneToOne(mappedBy = "location",fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private Flight flight;
	
	/*@OneToOne
    @JoinColumn(name="flight_id")
	private Flight flight;*/
	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Location(int locationId, String name, String code, String country, String airportName) {
		super();
		this.location_id = locationId;
		this.name = name;
		this.code = code;
		this.country = country;
		this.airportName = airportName;
	}
	public int getLocationId() {
		return location_id;
	}
	public void setLocationId(int locationId) {
		this.location_id = locationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	@Override
	public String toString() {
		return "Location [locationId=" + location_id + ", name=" + name + ", code=" + code + ", country=" + country
				+ ", airportName=" + airportName + "]";
	}
	
	
	

}