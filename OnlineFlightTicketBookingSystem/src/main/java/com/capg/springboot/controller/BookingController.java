package com.capg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.entity.Booking;
import com.capg.springboot.service.BookingService;

/*@RequestMapping: It is used to map web requests onto specific handler classes and/or handler methods.
* @RestController: The RestController allows to handle all REST APIs such as GET, POST, Delete, PUT requests.*/
@RequestMapping("/BookingController")
@RestController
public class BookingController 
{
	@Autowired
	private BookingService bookingservice;
	
	
	/****
	 * Method: addBooking
	 * Description: It allows to add the booking details.
	 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
	 * @Autowired: It enables to inject object dependency implicitly.
	 * @PathVariable: It is used to handle template variables in the request URL
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
     ***/
	  @PostMapping("/addBooking") public ResponseEntity<Booking> addBooking(@RequestBody
	  Booking customer) { Booking custImpl=bookingservice.addBooking(customer); return new
	  ResponseEntity<Booking>(custImpl,HttpStatus.OK); }
	  
	  /****
		 * Method: updateBooking
		 * Description: It allows to update the Booking details.
		 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
		 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
	     ***/
	  
	  @PostMapping("/modifyBooking") public ResponseEntity<Booking>
	  modifyCustomer(@RequestBody Booking customer) { Booking
	  custImpl=bookingservice.updateBooking(customer); return new
	  ResponseEntity<Booking>(custImpl,HttpStatus.OK); }
	  
	  /****
		 * Method: removeBooking
		 * Description: It allows to remove the Booking.
		 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
		 * @DeleteMapping: It is used to handle the HTTP DELETE requests matched with given URL expression.
		 ***/
	  @DeleteMapping("/removeBooking")
		public ResponseEntity<Booking> removeAddress(@RequestBody Booking add){
			((BookingService) bookingservice).removeBooking(add);
			return new ResponseEntity<Booking>(add,HttpStatus.OK);
		}
	
}