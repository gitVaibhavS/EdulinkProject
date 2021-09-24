package com.project.demo.Service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.Service.UserService;
import com.project.demo.daorepository.UserRepo;
import com.project.demo.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo userRepo;

	@Override
	public Map<String, String> saveUser(User user) {
		Map<String, String> response = new HashMap<>();
		// TODO Auto-generated method stub
		userRepo.save(user);
		response.put("message", "User Saved Succesfully");
		
		return response;
	}

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	

//	@Override
//	public User loginUser(User user) {
//		// TODO Auto-generated method stub
//		return userRepo.loginUser(user.getEmail(),user.getPassword());
//	}

	@Override
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.loginUser(user.getEmail(), user.getPassword());
	}
	
	
}
