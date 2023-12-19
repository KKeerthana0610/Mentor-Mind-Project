package com.toursimapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.toursimapp.entities.Login;
import com.toursimapp.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@GetMapping("/login")
	public Login login(@RequestHeader String email ,@RequestHeader String password) {
		return loginService.login(email,password); 
	}
	
	@PostMapping("/post")
	public Login addClint(@RequestBody Login login) {
		return loginService.addLogin(login);
	}
	
	@PutMapping("/update")
	public Login update(@RequestHeader String email ,@RequestBody Login login) {
		
		return loginService.updateDb(email,login); 
	}
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String email) {
		loginService.deleteDb(email);
		return "data deleted";
	}

}
