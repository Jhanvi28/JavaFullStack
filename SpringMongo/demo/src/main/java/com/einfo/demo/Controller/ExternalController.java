package com.einfo.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.einfo.demo.Repository.TranieeRepository;
import com.einfo.demo.model.Trainee;

@RestController
public class ExternalController {
	
	@Autowired
	TranieeRepository tr;
	@GetMapping("exetrainee")
	public List<Trainee> getTrainee()
	{
		return tr.findAll();
	}
	
}
