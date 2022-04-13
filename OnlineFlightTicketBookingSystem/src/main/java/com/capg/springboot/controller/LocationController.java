package com.capg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.entity.Location;
import com.capg.springboot.service.LocationService;

/*@RequestMapping: It is used to map web requests onto specific handler classes and/or handler methods.
* @RestController: The RestController allows to handle all REST APIs such as GET, POST, Delete, PUT requests.*/
@RequestMapping("/LocationController")
@RestController
public class LocationController {
	@Autowired
	private LocationService locationservice;
	
	/****
	 * Method: addLocation
	 * Description: It allows to add the location details.
	 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
	 * @Autowired: It enables to inject object dependency implicitly.
	 * @PathVariable: It is used to handle template variables in the request URL
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
     ***/
		@PostMapping("/addLocation")
		public ResponseEntity<Location> add(@RequestBody Location add)
		{
			Location locImpl=locationservice.addLocation(add);
			return new ResponseEntity(locImpl,HttpStatus.OK);
		}
		
		/****
		 * Method: updateLocation
		 * Description: It allows to update the Location details.
		 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
		 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
	     ***/
		@PostMapping("/modifyLocation")
		public ResponseEntity<Location> modifyLocation(@RequestBody Location add)
		{
			Location locImpl=locationservice.updateLocation(add);
			return new ResponseEntity(locImpl,HttpStatus.OK);
		}
		
		/****
		 * Method: removeLocation
		 * Description: It allows to remove the Location.
		 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
		 * @DeleteMapping: It is used to handle the HTTP DELETE requests matched with given URL expression.
		 ***/
		@DeleteMapping("/deleteLocation") 
		public ResponseEntity<Location> removeLocation(@RequestBody Location add)
		{
	       Location locImpl=locationservice.removeLocation(add);
	       return new ResponseEntity(locImpl,HttpStatus.OK); 
	    }
}