package com.capg.sringboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import com.capg.springboot.dto.FleetDto;
import com.capg.sringboot.entity.Fleet;


public abstract class FleetServiceImpl implements FleetService{
	@Autowired
	private FleetService FleetService;
	
	//Add User
	@Override
	public Fleet addFleet(Fleet add) {
		
		return FleetService.save(add);
		
	}
	
	//Modify User
	@Override
	public Fleet updateFleet(Fleet add) {
		FleetService.save(add);
		return add;
	}
	
	//Delete User
	@Override
	public Fleet viewFleetBy(String fleetid) throws Exception {
		Fleet add=FleetService.findFleetById(fleetid);
            if(add==null)
            	throw new Exception("Contact Not Found ");
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
	public FleetService modifyFleet(FleetDto Fleet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FleetService removeFleet(FleetDto Fleet) {
		// TODO Auto-generated method stub
		return null;
	}

}