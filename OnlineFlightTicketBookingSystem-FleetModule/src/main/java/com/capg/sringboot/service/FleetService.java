package com.capg.sringboot.service;

import com.capg.springboot.dto.FleetDto;

public interface FleetService {

    FleetService addFleet(FleetDto Fleet);

	FleetService modifyFleet(FleetDto Fleet);

	FleetService removeFleet(FleetDto Fleet);
}