package com.toursimapp.service;

import com.toursimapp.entities.Booking;

public interface BookingService {
	Booking getSerById(int serId );
	Booking addServiceDetail(Booking serviceDetail);
	Booking updateDb(int serId,Booking serviceDetail);
	void deleteDb(int serId);

}
