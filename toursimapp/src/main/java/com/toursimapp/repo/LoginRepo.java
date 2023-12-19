package com.toursimapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.toursimapp.entities.Login;

public interface LoginRepo extends  JpaRepository<Login, Integer> {
	@Query(value =  "select * from Clint where email=?" , nativeQuery = true)
	   Login findByEmail(String email);
		
	}
