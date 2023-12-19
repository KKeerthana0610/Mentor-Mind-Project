package com.toursimapp.service;

import com.toursimapp.entities.User;

public interface UserService {
	User login(String email, String password );


	User addUser(User user);

	User updateDb(String email,User user);

	void deleteDb(String email);
}


