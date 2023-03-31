package com.einfo.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.einfo.demo.Repository.TranieeRepository;
import com.einfo.demo.model.Trainee;

@RestController
public class TraineeController {
	
	@Autowired
	TranieeRepository tr;
	@RequestMapping("/addTrainee")
	public ModelAndView getAddTrainee()
	{

		return new ModelAndView("AddTrainee");		
		
	}
	@RequestMapping("/insertTrainee")
	public ModelAndView getTrainee(@RequestParam int tid,String tname,String tlocation)
	{
		ModelAndView mv = new ModelAndView("success");
		Trainee t = new Trainee(tid,tname,tlocation);
		System.out.println(t);
//		mv.addObject(id);
//		mv.addObject(name);
//		mv.addObject(location);
//		System.out.println(t);
		tr.save(t);
		
		return mv;
		
	}
	@RequestMapping("/updateTrainee")
	public Trainee updateTrainee()
	{
		return tr.save(new Trainee(2,"Ishita","Abad"));
		
	}
	@RequestMapping("/counttrainees")
	public long getCountTrainee()
	{
		return  tr.count();
	}
	
	
	
}
