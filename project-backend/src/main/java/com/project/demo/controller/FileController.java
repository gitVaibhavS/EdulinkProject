package com.project.demo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project.demo.Service.ApiResponse;

@RestController
@RequestMapping("/user/file")
public class FileController {

	public static String uploadDirectory = System.getProperty("user.dir")+"/fileuploads";
	
	@RequestMapping("/upload")
	public ResponseEntity<String> upload(Model model,@RequestParam("files") MultipartFile[] files) {
		
		StringBuilder fileNames= new StringBuilder();
		for(MultipartFile file: files) {
			Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
			fileNames.append(file.getOriginalFilename()+" ");
			try {
				Files.write(fileNameAndPath, file.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		model.addAttribute("msg", "Successfully uploaded files"+fileNames.toString());
		return ResponseEntity.ok("successful upload");
	}
}
