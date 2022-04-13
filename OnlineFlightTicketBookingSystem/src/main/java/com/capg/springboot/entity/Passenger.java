package com.capg.springboot.entity;

import javax.persistence.*;



@Entity
@Table(name="passenger")
public class Passenger {
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	private int passenger_id;
	@Column(name = "fname")
	private String firstName;
	@Column(name = "lname")
	private String lastName;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "passportno")
	private String passportNo;
	@Column(name = "mealpref")
	private String mealPref;
	
	@OneToOne(mappedBy = "passenger",fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private User user;
	
	/*@OneToOne
    @JoinColumn(name="user_id")
	private User user;*/
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(int id, String firstName, String lastName, int age, String gender, String passportNo,
			String mealPref) {
		super();
		this.passenger_id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.passportNo = passportNo;
		this.mealPref = mealPref;
	}
	public int getPassengerId() {
		return passenger_id;
	}
	public void setPassengerId(int passengerId) {
		this.passenger_id = passengerId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getMealPref() {
		return mealPref;
	}
	public void setMealPref(String mealPref) {
		this.mealPref = mealPref;
	}
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passenger_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", gender=" + gender + ", passportNo=" + passportNo + ", mealPref=" + mealPref
				+ ", user=" + user + "]";
	}
	

}