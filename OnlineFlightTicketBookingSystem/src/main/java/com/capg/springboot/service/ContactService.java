package com.capg.springboot.service;

import com.capg.springboot.entity.Contact;

public interface ContactService {

	Contact addContact(Contact customer);

	Contact updateContact(Contact customer);

	Contact removeContact(Contact customer);
}