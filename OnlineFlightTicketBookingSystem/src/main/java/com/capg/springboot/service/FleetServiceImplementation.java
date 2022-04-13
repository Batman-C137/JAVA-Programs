package com.capg.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.entity.Fleet;
import com.capg.springboot.repository.FleetRepository;

@Service
public class FleetServiceImplementation implements FleetService {
	/*
	 * @Autowired: It enables to inject object dependency implicitly.
	 * @Override: It informs the compiler that the element isn meant to override an element declared in a superclass
	 */
	@Autowired
	FleetRepository fleetrepository;

	@Override
	public Fleet addFleet(Fleet add) {
		// TODO Auto-generated method stub
		return fleetrepository.save(add);
	}

	@Override
	public Fleet updateFleet(Fleet add) {
		// TODO Auto-generated method stub
		return fleetrepository.save(add);
	}

	@Override
	public Fleet removeFleet(Fleet add) {
		// TODO Auto-generated method stub
		fleetrepository.delete(add);
		return add;
	}


}