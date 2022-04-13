package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.Flight;


public interface FlightRepository extends JpaRepository<Flight, String>{
	
	}