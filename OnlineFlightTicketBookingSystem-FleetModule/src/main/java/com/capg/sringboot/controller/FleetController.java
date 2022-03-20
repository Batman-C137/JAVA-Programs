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
import com.capg.springboot.service.FleetService;

public class FleetController<FleetService> {
	@Autowired
	private FleetService FleetService;
	
	//Add Fleet method
	@PostMapping("/addFleet")
	public ResponseEntity<Fleet> addFleet(@RequestBody FleetDto Fleet)
	{
		Fleet contImpl=FleetService.addFleet(Fleet);
		return new ResponseEntity(contImpl,HttpStatus.OK);
	}
	//Modify Fleet method
		@PostMapping("/modifyFleet")
		public ResponseEntity<Fleet> modifyFleet(@RequestBody FleetDto Fleet)
		{
			Fleet contImpl=FleetService.modifyFleet(Fleet);
			return new ResponseEntity(contImpl,HttpStatus.OK);
		}
		-
	//Deleting a Fleet
		@DeleteMapping("/deleteFleet") 
		public ResponseEntity<Fleet> removeContact(@RequestBody FleetDto Fleet)
		{
	       Contact custImpl=contactservice.removeCustomer(Contact);
	       return new ResponseEntity(custImpl,HttpStatus.OK); 
	    }
	