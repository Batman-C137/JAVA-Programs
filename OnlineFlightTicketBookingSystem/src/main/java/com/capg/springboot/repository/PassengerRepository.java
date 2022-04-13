package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger,Integer>{

}