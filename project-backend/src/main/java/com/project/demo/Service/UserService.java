package com.project.demo.Service;

import java.util.List;
import java.util.Map;

import com.project.demo.model.User;

public interface UserService {

	Map<String,String> saveUser(User user);
	
	List<User> getUser();
	
	User loginUser(String email, String password);

	User loginUser(User user);
}


