package com.capg.springboot.entity;

import javax.persistence.*;

@Entity
@Table(name="fleet")
public class Fleet {
	
			@Id
			@GeneratedValue
			@Column(name = "id", unique = true, nullable = false)
			private int fleet_id;
			@Column(name = "code")
			private String code;
			@Column(name = "model")
			private String model;
			@Column(name = "economy")
			private int totalEconomySeats;
			@Column(name = "premium")
			private int totalPremiumSeats;
			@Column(name = "business")
			private int totalBusinessSeats;
		
			@OneToOne(mappedBy = "fleet",fetch = FetchType.LAZY , cascade = CascadeType.ALL)
			private Flight flight;
			
			/*@OneToOne
		    @JoinColumn(name="flight_id")
			private Flight flight;*/
			
			public Fleet() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Fleet(int fleetId, String code, String model, int totalEconomySeats, int totalPremiumSeats,
					int totalBusinessSeats) {
				super();
				this.fleet_id = fleetId;
				this.code = code;
				this.model = model;
				this.totalEconomySeats = totalEconomySeats;
				this.totalPremiumSeats = totalPremiumSeats;
				this.totalBusinessSeats = totalBusinessSeats;
			}
			public int getFleetId() {
				return fleet_id;
			}
			public void setFleetId(int fleetId) {
				this.fleet_id = fleetId;
			}
			public String getCode() {
				return code;
			}
			public void setCode(String code) {
				this.code = code;
			}
			public String getModel() {
				return model;
			}
			public void setModel(String model) {
				this.model = model;
			}
			public int getTotalEconomySeats() {
				return totalEconomySeats;
			}
			public void setTotalEconomySeats(int totalEconomySeats) {
				this.totalEconomySeats = totalEconomySeats;
			}
			public int getTotalPremiumSeats() {
				return totalPremiumSeats;
			}
			public void setTotalPremiumSeats(int totalPremiumSeats) {
				this.totalPremiumSeats = totalPremiumSeats;
			}
			public int getTotalBusinessSeats() {
				return totalBusinessSeats;
			}
			public void setTotalBusinessSeats(int totalBusinessSeats) {
				this.totalBusinessSeats = totalBusinessSeats;
			}
			
}