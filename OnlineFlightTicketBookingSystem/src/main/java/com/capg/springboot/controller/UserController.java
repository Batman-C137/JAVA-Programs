package com.capg.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.capg.springboot.entity.User;
import com.capg.springboot.exceptions.UserNotFoundException;
import com.capg.springboot.service.UserService;

import antlr.collections.List;

/*@RequestMapping: It is used to map web requests onto specific handler classes and/or handler methods.
* @RestController: The RestController allows to handle all REST APIs such as GET, POST, Delete, PUT requests.*/

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/userController")
public class UserController 
{
	@Autowired
	private UserService userservice;
	
	/****
	 * Method: addUser
	 * Description: It allows to add the user details.
	 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
	 * @Autowired: It enables to inject object dependency implicitly.
	 * @PathVariable: It is used to handle template variables in the request URL
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
     ***/
	  @PostMapping("/addUser") public ResponseEntity<User> addUser(@RequestBody
	  User customer) { User custImpl=userservice.addUser(customer); return new
	  ResponseEntity(custImpl,HttpStatus.OK); }
	  
	  /****
		 * Method: updateuser
		 * Description: It allows to update the user details.
		 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
		 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
	     ***/
	  @PostMapping("/updateUser") public ResponseEntity<User>
	  modifyCustomer(@RequestBody User customer) { User
	  custImpl=userservice.updateUser(customer); return new
	  ResponseEntity(custImpl,HttpStatus.OK); }
	  
	  /****
		 * Method: removeuser
		 * Description: It allows to remove the user.
		 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
		 * @DeleteMapping: It is used to handle the HTTP DELETE requests matched with given URL expression.
		 ***/
	  @DeleteMapping("/removeUser")
		public ResponseEntity<User> removeUser(@RequestBody User add){
			userservice.removeUser(add);
			return new ResponseEntity(add,HttpStatus.OK);
		}
}