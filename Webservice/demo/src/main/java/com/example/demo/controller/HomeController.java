package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

public class HomeController {
	
	@RequestMapping("trainees")
	public ResponseEntity<String> getTrainee()
	{
		RestTemplate rt = new RestTemplate();
		return rt.getForEntity("https://localhost:8080/exetrainee", String.class);
	}
}
