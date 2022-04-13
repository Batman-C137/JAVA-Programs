package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capg.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {


}