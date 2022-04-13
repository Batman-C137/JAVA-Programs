package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.Location;

public interface LocationRepository extends JpaRepository<Location, String> {

}