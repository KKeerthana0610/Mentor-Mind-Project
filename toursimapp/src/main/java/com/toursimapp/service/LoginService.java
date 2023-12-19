package com.toursimapp.service;

import com.toursimapp.entities.Login;

public interface LoginService {
	Login login(String email ,String password);
	Login addClint(Login clint);
	Login updateDb(String email,Login clint);
	void deleteDb(String email);
}


