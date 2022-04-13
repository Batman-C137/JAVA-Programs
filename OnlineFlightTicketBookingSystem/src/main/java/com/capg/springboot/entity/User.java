package com.capg.springboot.entity;


import javax.persistence.*;

@Entity
@Table(name="user")

public class User 
{
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	private int user_id;
	@Column(name = "name")
	private String userName;
	@Column(name = "password")
	private String password;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "email")
	private String email;
	
	@OneToOne
    @JoinColumn(name="contact_id")
	private Contact contact;
	
	
	@OneToOne
    @JoinColumn(name="passenger_id")
	private Passenger passenger;
	
	@OneToOne
    @JoinColumn(name="booking_id")
	private Booking booking;
	
	public int getUserId() {
		return user_id;
	}
	public void setUserId(int id) {
		this.user_id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public User(int id, String userName, String password, String firstName, String lastName, String email,
			Contact contact) {
		super();
		this.user_id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "User [UserId=" + user_id + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", contact=" + contact + ", passenger="
				+ passenger + ", booking=" + booking + "]";
	}
	
	
	
}