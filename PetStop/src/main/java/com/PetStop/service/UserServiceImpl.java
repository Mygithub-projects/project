package com.PetStop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PetStop.model.User;
import com.PetStop.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	@Override
	public User searchByUserNameAndPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return userRepository.findByUserNameAndPassword(userName, password);
	}
	@Override
	public int searchOwnerIdByUserName(String userName) {
		// TODO Auto-generated method stub
		return userRepository.findOwnerIdByUserName(userName);
	}
	 @Override 

	    public void save(User user) {  

	        userRepository.save(user); 

	    } 

	 @Override 

	    public User searchByUserName(String userName) { 

	        return userRepository.findByUserName(userName); 

	    } 
	

}
