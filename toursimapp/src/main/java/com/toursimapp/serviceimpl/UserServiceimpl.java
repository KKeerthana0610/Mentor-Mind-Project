package com.toursimapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodorderdeliverySystem.service.UserService;
import com.toursimapp.entities.User;
import com.toursimapp.exception.ResourceNotFoundException;
import com.toursimapp.repo.UserRepo;

@Service

public class UserServiceimpl implements UserService  {
	@Autowired
	UserRepo userRepo;
	
	public User login(String email, String password) {
		User s = userRepo.findByEmail(email);
		 
		 if(s!=null) {
			 if(s.getPassword().equals(password)) {
				 return s;
			 }else {
				throw new ResourceNotFoundException();
			}
		 }else {
			 throw new ResourceNotFoundException();
		 }
	  
	}

	public User addUser(User user) {
		return  userRepo.save(user);
	}

	public User updateDb(String email,User user) {
		
		
		User s1 = userRepo.findByEmail(email);
		
		if(s1!=null) {
			s1.setFirstName(user.getFirstName());   
			s1.setLastName(user.getLastName());
			s1.setPassword(user.getPassword());
			s1.setMobileNumber(user.getMobileNumber());
			s1.setLocation(user.getLocation());
			
		return userRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	public void deleteDb(String email) {
	

		User s2 = userRepo.findByEmail(email);
		
		if(s2!=null) {
			userRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}

	
}


