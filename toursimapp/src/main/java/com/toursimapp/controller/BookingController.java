package com.toursimapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.demo.store.entities.ServiceDetail;
import com.demo.store.service.ServiceDetailService;
import com.toursimapp.entities.Booking;
import com.toursimapp.service.BookingService;

public class BookingController {
	@Autowired
    BookingService serviceDetailService;
	
	@GetMapping("/room/{Id}")
	public Booking getSerById(@PathVariable int serId) {
		return bookingService.getSerById(id); 
	}
	
	@PostMapping("/postroom")
	public Booking addServiceDetail(@RequestBody Booking booking) {
		
		return bookingService.addServiceDetail(ServiceDetail);
	}
	
	@PutMapping("/updateroom")
	public Booking update(@RequestHeader int serId ,@RequestBody Booking booking) {
		
		return bookingService.updateDb(serId ,booking); 
	}
	@DeleteMapping("/deleteroom")
	public String delete(@RequestHeader  int id ) {
		bookingService.deleteDb(id );
		return "data deleted";
	}
	
	
}



}
