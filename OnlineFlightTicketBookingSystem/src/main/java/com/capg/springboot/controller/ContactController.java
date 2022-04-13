package com.capg.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.Contact;
import com.capg.springboot.service.ContactService;

/*@RequestMapping: It is used to map web requests onto specific handler classes and/or handler methods.
* @RestController: The RestController allows to handle all REST APIs such as GET, POST, Delete, PUT requests.*/
@RequestMapping("/contactController")
@RestController
public class ContactController {
	@Autowired
	private ContactService contactservice;
	
	/****
	 * Method: addContact
	 * Description: It allows to add the contact details.
	 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
	 * @Autowired: It enables to inject object dependency implicitly.
	 * @PathVariable: It is used to handle template variables in the request URL
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
     ***/
		@PostMapping("/addContact")
		public ResponseEntity<Contact> addContact(@RequestBody Contact customer)
		{
			Contact contImpl=contactservice.addContact(customer);
			return new ResponseEntity<Contact>(contImpl,HttpStatus.OK);
		}
		
		/****
		 * Method: updateContact
		 * Description: It allows to update the Contact details.
		 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
		 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
	     ***/
			@PostMapping("/modifyContact")
			public ResponseEntity<Contact> updateContact(@RequestBody Contact customer)
			{
				Contact contImpl=contactservice.updateContact(customer);
				return new ResponseEntity<Contact>(contImpl,HttpStatus.OK);
			}
			
			/****
			 * Method: removeContact
			 * Description: It allows to remove the contact.
			 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
			 * @DeleteMapping: It is used to handle the HTTP DELETE requests matched with given URL expression.
			 ***/
			@DeleteMapping("/removeContact") 
			public ResponseEntity<Contact> removeContact(@RequestBody Contact add)
			{
		       contactservice.removeContact(add);
		       return new ResponseEntity<Contact>(add,HttpStatus.OK); 
		    }

}