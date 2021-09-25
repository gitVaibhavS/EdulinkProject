package com.project.demo.Service;

import java.util.List;
import java.util.Map;

import com.project.demo.dto.LoginDto;
import com.project.demo.dto.RegisterDto;
import com.project.demo.model.User;

public interface UserService {


	Map<String,String> saveUser(User user);
	
	ApiResponse login(LoginDto loginDto);
	
	
	
	
	/*
	 Map<String,String> saveUser(User user);
	 
	
	List<User> getUser();
	
	User loginUser(User user);
		
	User userLogin(String email, String password);
	*/

}


