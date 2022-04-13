package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.Fleet;
public interface FleetRepository extends JpaRepository<Fleet, Integer> {

}