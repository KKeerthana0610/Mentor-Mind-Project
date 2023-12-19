package com.toursimapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.toursimapp.entities.Booking;



public interface BookingRepo extends  JpaRepository<Booking, Integer> {
	@Query(value =  "select * from ServiceDetail where serId =?" , nativeQuery = true)
	   Booking findById(int serid);
}


