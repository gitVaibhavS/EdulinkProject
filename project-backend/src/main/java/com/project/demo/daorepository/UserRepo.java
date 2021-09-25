package com.project.demo.daorepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.demo.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
	User findByEmail(String email);
	
	User findByPassword(String password);


	
//	@Query("from User where email=:email and password=:password")
//	User loginUser(@Param("email") String email,@Param("password")String password);
 }
