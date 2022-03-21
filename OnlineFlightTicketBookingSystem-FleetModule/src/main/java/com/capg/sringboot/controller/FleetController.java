package com.capg.sringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.dto.FleetDto;
import com.capg.sringboot.entity.Fleet;
import com.capg.sringboot.service.FleetService;



@RequestMapping("/FleetController")
@RestController


public class FleetController {
	private static final FleetDto Fleet = null;
	@Autowired
	private FleetService Fleetservice;
	
	//Add Fleet method
	@PostMapping("/addFleet")
	public ResponseEntity<Fleet> addCustomer(@RequestBody FleetDto customer)
	{
		FleetService FleetServiceImpl=Fleetservice.addFleet(Fleet);
		return new ResponseEntity(FleetServiceImpl,HttpStatus.OK);
	}
	
	//Modify Fleet method
	@PostMapping("/modifyFleet")
	public ResponseEntity<Fleet> modifyCustomer(@RequestBody FleetDto customer)
	{
		Fleet FleetServiceImpl=Fleetservice.modifyFleet(Fleet);
		return new ResponseEntity(FleetServiceImpl,HttpStatus.OK);
	}
	
	//Deleting a Fleet
	@DeleteMapping("/deleteFleet") 
	public ResponseEntity<Fleet> removeFleet(@RequestBody Fleet fleet)
	{
       Fleet FleetServiceImpl=Fleetservice.removeFleet(Fleet);
       return new ResponseEntity<com.capg.sringboot.entity.Fleet>(FleetServiceImpl,HttpStatus.OK); 
    }
}