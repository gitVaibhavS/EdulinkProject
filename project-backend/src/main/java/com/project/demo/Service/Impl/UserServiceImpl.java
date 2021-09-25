
package com.project.demo.Service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;
import javax.validation.OverridesAttribute;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.Service.ApiResponse;
import com.project.demo.Service.UserService;
import com.project.demo.daorepository.UserRepo;
import com.project.demo.dto.LoginDto;
import com.project.demo.dto.RegisterDto;
import com.project.demo.model.User;

@Transactional
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public Map<String, String> saveUser(User user) {
		Map<String, String> response = new HashMap<>();
		// TODO Auto-generated method stub
		userRepo.save(user);
		response.put("message", "User Saved Succesfully");
		
		return response;
	}
	
	
		
		
		//		BeanUtils.copyProperties(registerDto, user);
//		userRepoImpl.save(user);
//		return new ApiResponse(200, "success", user);	
//		


	@Override
	public ApiResponse login(LoginDto loginDto) {
		
		User user = userRepo.findByEmail(loginDto.getEmail());
		
		if(user == null) {
			throw new RuntimeException("User does not exist");
		}
		
		if(!user.getPassword().equals(loginDto.getPassword())) {
			throw new RuntimeException("Password mismatch");
		}
		
		return new ApiResponse(200, "Login success", null);
		
		
	}
	
	
	
	
	
}	
	



//@Override
//public Map<> register(RegisterDto registerDto) {
//	User user = new User(registerDto.getFirstName(),
//			registerDto.getLastName(),
//			registerDto.getEmail(),
//			registerDto.getPassword());
//	
//	return new ApiResponse(200, "success", user);
//}

	
	
	/*
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

	@Override
	public User loginUser(User user) {
				
		return userRepo.loginUser(user.getEmail(), user.getPassword());
	}

	@Override
	public User userLogin(String email, String password) {
		return userRepo.loginUser(email, password);
	}
	
	
}
*/