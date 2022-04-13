package com.capg.springboot.entity;

import javax.persistence.*;
@Entity
@Table(name="contact")
public class Contact {
	
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	private int contact_id;
	@Column(name = "type")
	private String type;
	@Column(name = "address")
	private String addressLine;
	@Column(name = "zipcode")
	private long zipCode;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "country")
	private String country;
	@Column(name = "mobile")
	private long mobileNo;
	
	@OneToOne(mappedBy = "contact",fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private User user;
	
	/*@OneToOne
    @JoinColumn(name="user_id")
	private User user;*/
	
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustomerId() {
		return contact_id;
	}
	public void setCustomerId(int customerId) {
		this.contact_id = customerId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	@Override
	public String toString() {
		return "Contact [customerId=" + contact_id + ", type=" + type + ", addressLine=" + addressLine + ", zipCode="
				+ zipCode + ", city=" + city + ", state=" + state + ", country=" + country + ", mobileNo=" + mobileNo
				+ ", user=" + user + "]";
	}

}