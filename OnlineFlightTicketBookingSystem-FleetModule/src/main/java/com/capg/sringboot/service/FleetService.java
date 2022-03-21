package com.capg.sringboot.service;

import javax.security.auth.login.AccountNotFoundException;

import com.capg.springboot.dto.FleetDto;
import com.capg.sringboot.entity.Fleet;

public interface FleetService {

    FleetService addFleet(FleetDto Fleet);

	FleetService modifyFleet(FleetDto Fleet);

	FleetService removeFleet(FleetDto Fleet);

	Fleet addFleet(Fleet add);

	Fleet save(Fleet add);

	Fleet updateFleet(Fleet add);

	Fleet viewFleetBy(String fleetid) throws AccountNotFoundException, Exception;

	Fleet findFleetById(String fleetid);


}
