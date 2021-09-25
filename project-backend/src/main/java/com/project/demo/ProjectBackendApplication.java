package com.project.demo;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.project.demo.controller.FileController;

@SpringBootApplication
@ComponentScan({"com.project.demo","com.project.demo.controller"})
public class ProjectBackendApplication extends WebMvcConfigurerAdapter{

	
	
	public static void main(String[] args) {
		new File(FileController.uploadDirectory).mkdir();
		SpringApplication.run(ProjectBackendApplication.class, args);
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// TODO Auto-generated method stub
	 registry.addMapping("/**").allowedMethods("PUT","DELETE","POST","GET");
	}

}
