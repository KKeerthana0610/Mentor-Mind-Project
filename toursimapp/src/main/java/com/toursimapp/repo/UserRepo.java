package com.toursimapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.toursimapp.entities.User;



public interface UserRepo extends JpaRepository<User, Integer> {
	@Query(value =  "select * from User where email =?" , nativeQuery = true)
	User findByEmail(String email);

	
	
	
}


