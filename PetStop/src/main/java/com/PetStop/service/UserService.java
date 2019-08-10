package com.PetStop.service;

import com.PetStop.model.User;

public interface UserService {
	
	public User searchByUserNameAndPassword(String userName, String password);
	public int searchOwnerIdByUserName(String userName);
	
	void save(User user); 

	public User searchByUserName(String userName);
}
