package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.capg.springboot.entity.Passenger;
import com.capg.springboot.exceptions.PassengerNotFoundException;
import com.capg.springboot.service.PassengerService;

/*@RequestMapping: It is used to map web requests onto specific handler classes and/or handler methods.
* @RestController: The RestController allows to handle all REST APIs such as GET, POST, Delete, PUT requests.*/
@RestController
@RequestMapping("/addPassenger")
public class PassengerController {
	
	@Autowired
	private PassengerService passengerservice;

	/* Method: addPassenger
	 * Description: It allows to add the passenger details.
	 * @RequestMapping: It is used to map HTTP requests to handler methods of MVC and REST controllers.
	 * @RestController: It is used to create RESTful web services using MVC.
	 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
	 * @Autowired: It enables to inject object dependency implicitly.
	 * @PathVariable: It is used to handle template variables in the request URL
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
     */
	@PostMapping("/addPassenger")
	public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger add){
		passengerservice.addPassenger(add);
		return new ResponseEntity(add,HttpStatus.OK);
	}
		
//*************	
	
		/* Method: updatePassenger
		 * Description: It allows to update the passenger.
		 * @PutMapping: It is used to handle the HTTP PUT requests matched with given URL expression.
		 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
	     */
	@PostMapping("/updatePassenger")
	public ResponseEntity<Passenger> updatePassenger(@RequestBody Passenger add){
		passengerservice.updatePassenger(add);
		return new ResponseEntity(add,HttpStatus.OK);
	}
	
//*************	
	
		/* Method: removePassenger
		 * Description: It allows to remove the passenger.
		 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
		 * @DeleteMapping: It is used to handle the HTTP DELETE requests matched with given URL expression.
		 */

		@DeleteMapping("/removePassenger")
		public ResponseEntity<Passenger> removePassenger(@RequestBody Passenger add){
			passengerservice.removePassenger(add);
			return new ResponseEntity(add,HttpStatus.OK);
		}
}