package com.toursimapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.toursimapp.entities.Login;
import com.toursimapp.exception.ResourceNotFoundException;
import com.toursimapp.repo.LoginRepo;
import com.toursimapp.service.LoginService;

@Service

public class LoginServiceimpl implements LoginService {
	@Autowired
	LoginRepo clintRepo;
	
	public Login login(String email, String password) {
		 Login s = clintRepo.findByEmail(email);
		 
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

	@Override
	public  Login addClint( Login login) {
		return  clintRepo.save( login);
	}

	@Override
	public  Login updateDb(String email, Login  login) {
		
		
		Login s1 = clintRepo.findByEmail(email);
		
		if(s1!=null) {
			s1.setUsername( login.getUsername());   
			
			s1.setPassword(login.getPassword());
		return clintRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	public void deleteDb(String email) {
	
		
		 Login s2 =loginRepo.findByEmail(email);
		
		if(s2!=null) {
			loginRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}

	
	
}


