package com.capg.springboot.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.capg.springboot.dto.FleetDto;
import com.capg.springboot.entity.Fleet;


public abstract class FleetServiceImplementation implements FleetService{
	@Autowired
	private FleetService FleetService;
	
	//Add User
	@Override
	public Fleet addFleet(Fleet add) {
		
		return FleetService.save(add);
		
	}
	
	//Modify User
	@Override
	public Fleet modifyFleet(Fleet Fleet, int FleetId) {
		Optional<Fleet> a = FleetService.findFleetById(FleetId);
		if(a.isPresent()) {
			Fleet modified = a.get();
			modified.setFleetId(Fleet.getFleetId());
            modified.setCode(Fleet.getCode());
            modified.setModel(Fleet.getModel());
            modified.setTotalEconomySeats(Fleet.getTotalEconomySeats());
            modified.setTotalPremiumSeats(Fleet.getTotalPremiumSeats());
            modified.setTotalBusinessSeats(Fleet.getTotalBusinessSeats());

			FleetService.save(modified);
			return modified;
		}
		return null;
	}
	
	//Delete User
	@Override
	public Fleet viewFleetBy(String fleetid) throws Exception {
		Fleet add=FleetService.findFleetById(fleetid);
            if(add==null)
            	throw new Exception("Fleet Not Found ");
        return add;
	}

	public Fleet save(Fleet add) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FleetService addFleet(FleetDto Fleet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fleet modifyFleet(FleetDto Fleet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fleet removeFleet(FleetDto Fleet) {
		// TODO Auto-generated method stub
		return null;
	}

}