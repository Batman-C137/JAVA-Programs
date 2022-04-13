package com.capg.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.entity.Flight;
import com.capg.springboot.repository.FlightRepository;

@Service
@Transactional
public class FlightServiceImplementation implements FlightService {

	/*
	 * @Autowired: It enables to inject object dependency implicitly.
	 * @Override: It informs the compiler that the element isn meant to override an element declared in a superclass
	 */
	@Autowired 
	private FlightRepository flightrepository;
	
	//Add User
			@Override
			public Flight addFlight(Flight add) {
				
				return flightrepository.save(add);
				
			}
			
			//Modify User
			@Override
			public Flight updateFlight(Flight add) {
				
				return flightrepository.save(add);
				
			}
			//Delete User
			public Flight deleteFlight(Flight add) {
				flightrepository.delete(add);
				return add;
				//return contactRepository.delete(add);
			}
}