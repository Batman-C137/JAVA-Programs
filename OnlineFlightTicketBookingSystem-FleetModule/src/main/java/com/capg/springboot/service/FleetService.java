package com.capg.springboot.service;

import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;

import com.capg.springboot.dto.FleetDto;
import com.capg.springboot.entity.Fleet;

public interface FleetService {

    FleetService addFleet(FleetDto Fleet);

	Fleet modifyFleet(FleetDto Fleet);

	Fleet removeFleet(FleetDto Fleet);

	Fleet addFleet(Fleet add);

	Fleet save(Fleet add);

	Fleet updateFleet(Fleet add);

	Fleet viewFleetBy(String fleetid) throws AccountNotFoundException, Exception;

	Fleet findFleetById(String fleetid);

	Fleet modifyFleet(Fleet Fleet, int FleetId);

	Optional<Fleet> findFleetById(int fleetId);

	Fleet removeFleet(Fleet fleet);


}