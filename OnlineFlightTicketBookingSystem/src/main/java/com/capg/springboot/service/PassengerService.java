package com.capg.springboot.service;

import com.capg.springboot.entity.Passenger;

public interface PassengerService {

	Passenger addPassenger(Passenger add);
	Passenger removePassenger(Passenger add);
	Passenger updatePassenger(Passenger add);

}