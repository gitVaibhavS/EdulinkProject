package com.project.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.Service.ApiResponse;
import com.project.demo.Service.UserService;
import com.project.demo.dto.LoginDto;
import com.project.demo.dto.RegisterDto;
import com.project.demo.model.User;

@RestController
@RequestMapping("/users")
public  class UserControl{
	
	@Autowired
	UserService userService;
	
//	@PostMapping("/register")
//	public ApiResponse register(@RequestBody RegisterDto registerDto) {
//		return userService.register(registerDto);
//	}
	
	@PostMapping("/saveUser")
	public ResponseEntity<Map<String,String>> saveUser(@RequestBody User User){
		Map<String,String> response = userService.saveUser(User);
		return new ResponseEntity<Map<String,String>>(response,HttpStatus.CREATED);
		
	}
	
	@PostMapping("/login")
	public ApiResponse login(@RequestBody LoginDto loginDto) {
		return userService.login(loginDto);
	}
}



/*
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.Service.ApiResponse;
import com.project.demo.Service.UserService;
import com.project.demo.daorepository.UserRepo;
import com.project.demo.dto.RegisterDto;
import com.project.demo.model.User;
*/










	/*
	//API Start
	@PostMapping("/saveUser")
	public ResponseEntity<Map<String,String>> saveUser(@RequestBody User User){
		Map<String,String> response = userService.saveUser(User);
		return new ResponseEntity<Map<String,String>>(response,HttpStatus.CREATED);
		
	}

	@GetMapping("/userlist")
	public List<User> getUser(){
		return userService.getUser();	
	}
	
	@GetMapping("/login")
	public String loginUser(User user) {
		return (user.getPassword());
	}
*/




//@RequestMapping("/")
//private String home(){
//	
//	return "index.html";
//}
//
//@RequestMapping("/register")
//private String register(){
//	return "register.html";
//}
//
//@RequestMapping("/success")
//private String registration(User u) {
//	userRepo.save(u);
//	return "success.html";
//}
//
//@RequestMapping("/logteacher")
//private String lgteacher()
//{
//	
//	return "logteacher.html";
//}
//
//@RequestMapping("/logstudent")
//private String lgstudent()
//{
//	
//	return "logstudent.html";
//}
//
//@RequestMapping("/teacher")
//private String teacher()
//{
//	
//	return "teacher.html";
//}
//
//@RequestMapping("/student")
//private String student()
//{
//	
//	return "student.html";
//}
//
//
//
//
////	if(userRepo.equals(u.getEmail()) && userRepo.equals(u.getPassword())) {
////		return "teacher.html";
////	}else {
////		return"You've entered wrong details. Please login again.";
////	}
////}
//
