package com.capg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.entity.Flight;
import com.capg.springboot.service.FlightService;

/*@RequestMapping: It is used to map web requests onto specific handler classes and/or handler methods.
* @RestController: The RestController allows to handle all REST APIs such as GET, POST, Delete, PUT requests.*/@RequestMapping("/FlightController")
@RestController
public class FlightController
{
@Autowired
private FlightService FlightService;

/****
 * Method: addflight
 * Description: It allows to add the flight details.
 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
 * @Autowired: It enables to inject object dependency implicitly.
 * @PathVariable: It is used to handle template variables in the request URL
 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
 ***/
@PostMapping("/addFlight")
public ResponseEntity<Flight> addFlight(@RequestBody Flight flight)
{
	Flight flightimpl=FlightService.addFlight(flight);
	return new ResponseEntity<Flight>(flight,HttpStatus.OK);
}

/****
 * Method: updateflight
 * Description: It allows to update the flight details.
 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
 ***/
@PostMapping("/modifyFlight")
public ResponseEntity<Flight> modifyFlight(@RequestBody Flight flight)
{
	Flight flightimpl=FlightService.updateFlight(flight);
	return new ResponseEntity<Flight>(flightimpl,HttpStatus.OK);
}

/****
 * Method: removeflight
 * Description: It allows to remove the flight.
 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
 * @DeleteMapping: It is used to handle the HTTP DELETE requests matched with given URL expression.
 ***/
@DeleteMapping("/deleteFlight") 
public ResponseEntity<Flight> removeFlight(@RequestBody Flight add)
{
   FlightService.deleteFlight(add);
   return new ResponseEntity<Flight>(add,HttpStatus.OK); 
}

	
}