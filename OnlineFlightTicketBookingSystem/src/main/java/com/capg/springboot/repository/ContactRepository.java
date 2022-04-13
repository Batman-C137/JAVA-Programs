package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.Contact;
public interface ContactRepository extends JpaRepository<Contact, String>{

}