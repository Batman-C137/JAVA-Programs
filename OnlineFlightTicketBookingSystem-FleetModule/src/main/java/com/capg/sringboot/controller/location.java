package com.capg.sringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/locationController")
public class locationlocation {
	
	@Autowired
	private location locations;
	
	@PostMapping("/addlocation")
	public ResponseEntity<location> addAddress(@RequestBody location add){
		locations.addlocation(add);
		return new ResponseEntity<location>(add,HttpStatus.OK);
	}

	
	@DeleteMapping("/removelocation")
	public ResponseEntity<location> removeAddress(@RequestBody location add){
		locations.removelocation(add);
		return new ResponseEntity(add,HttpStatus.OK);
	}


	
	@PutMapping("/updatelocation")
	public ResponseEntity<location> updatelocation(@RequestBody location add){
		locations.updatelocation(add);
		return new ResponseEntity(add,HttpStatus.OK);
	}


	public location getLocations() {
		return locations;
	}


	public void setLocations(location locations) {
		this.locations = locations;
	}
}
