package com.toursimapp.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toursimapp.entities.Booking;
import com.toursimapp.repo.BookingRepo;


@Service
public class BookingServicrimpl {
	@Autowired
	BookingRepo serviceDetailRepo ;
	private Object serId;
	
	public Booking getSerById(int serId) {
		Optional<Booking> s=Optional.ofNullable(bookingRepo .findById(serId));
		Booking sd;
		if(s.isPresent())
		{
			 sd=s.get();
		}else {
				throw new ResourceNotFoundException();
			}
		return sd;
	  
	}

	public Booking addServiceDetail(Booking booking) {
		return  bookingRepo.save(booking);
	}

	public Booking updateDb(int serId,ServiceDetail serviceDetail) {
		
		
		ServiceDetail s1 = serviceDetailRepo.findById(serId);
		if(s1!=null) {  
			s1.setTimes(serviceDetail.getTimes());
			s1.setDiscount(serviceDetail.getDiscount());
			s1.setEvents(serviceDetail.getEvents());
		return serviceDetailRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}
	public void deleteDb(int serId) {		
		ServiceDetail s2 = serviceDetailRepo .findById(serId);
		
		if(s2!=null) {
			serviceDetailRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}
}


}
