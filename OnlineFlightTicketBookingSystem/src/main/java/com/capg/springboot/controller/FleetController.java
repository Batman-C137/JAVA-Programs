package com.capg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.entity.Fleet;
import com.capg.springboot.service.FleetService;


/*@RequestMapping: It is used to map web requests onto specific handler classes and/or handler methods.
* @RestController: The RestController allows to handle all REST APIs such as GET, POST, Delete, PUT requests.*/@RequestMapping("/FleetController")
@RestController
public class FleetController {
	@Autowired
	private FleetService Fleetservice;
	
	/****
	 * Method: addfleet
	 * Description: It allows to add the fleet details.
	 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
	 * @Autowired: It enables to inject object dependency implicitly.
	 * @PathVariable: It is used to handle template variables in the request URL
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
     ***/
	@PostMapping("/addFleet")
	public ResponseEntity<Fleet> addCustomer(@RequestBody Fleet add)
	{
		Fleetservice.addFleet(add);
		return new ResponseEntity<Fleet>(add,HttpStatus.OK);
	}
	
	/****
	 * Method: updatefleet
	 * Description: It allows to update the fleet details.
	 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
     ***/
	@PostMapping("/UpdateFleet")
	public ResponseEntity<Fleet> updateCustomer(@RequestBody Fleet add)
	{
		Fleetservice.updateFleet(add);
		return new ResponseEntity<Fleet>(add,HttpStatus.OK);
	}
	
	/****
	 * Method: removefleet
	 * Description: It allows to remove the fleet.
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
	 * @DeleteMapping: It is used to handle the HTTP DELETE requests matched with given URL expression.
	 ***/
	@DeleteMapping("/deleteFleet") 
	public ResponseEntity<Fleet> removeFleet(@RequestBody Fleet add)
	{
       Fleetservice.removeFleet(add);
       return new ResponseEntity<Fleet>(add,HttpStatus.OK); 
    }
}