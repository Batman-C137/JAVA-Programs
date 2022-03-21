package com.capg.springboot.entity;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="fleet")
public class Fleet {
			@Id
			private int fleetId;
			private String code;
			private String model;
			private int totalEconomySeats;
			private int totalPremiumSeats;
			private int totalBusinessSeats;
			
			
			public Fleet() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Fleet(int fleetId, String code, String model, int totalEconomySeats, int totalPremiumSeats,
					int totalBusinessSeats) {
				super();
				this.fleetId = fleetId;
				this.code = code;
				this.model = model;
				this.totalEconomySeats = totalEconomySeats;
				this.totalPremiumSeats = totalPremiumSeats;
				this.totalBusinessSeats = totalBusinessSeats;
			}
			public int getFleetId() {
				return fleetId;
			}
			public void setFleetId(int fleetId) {
				this.fleetId = fleetId;
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
			public Object getFleetName() {
				// TODO Auto-generated method stub
				return null;
			}
			public void setFleetName(Object fleetName) {
				// TODO Auto-generated method stub
				
			}
			public Object getFleetCode() {
				// TODO Auto-generated method stub
				return null;
			}
			public void setFleetCode(Object fleetCode) {
				// TODO Auto-generated method stub
				
			}
			
			
			
}
