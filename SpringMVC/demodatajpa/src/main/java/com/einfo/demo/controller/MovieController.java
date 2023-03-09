package com.einfo.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfo.demo.dao.MovieDao;
import com.einfo.demo.model.Movie;

@RestController
public class MovieController {
	
	@Autowired
	MovieDao mdoa;
	@RequestMapping("/")
	public ModelAndView getHomePage()
	{
		return new ModelAndView("home");
	}
	@RequestMapping("movieForm")
	public ModelAndView getMoviePage()
	{
		return new ModelAndView("MovieForm");
	}
	@RequestMapping("addMovie")
	public ModelAndView getMovieData(@RequestParam int mid,String mname,String lang,String mdirector)
	{
		ModelAndView mv = new ModelAndView("success");
		
		mv.addObject("value1", mid);
		mv.addObject("value2",mname);
		mv.addObject("value3", lang);
		mv.addObject("value4", mdirector);
		 
		Movie m = new Movie(mid,mdirector,lang,mname);
		mdoa.save(m);
		return mv;
	}
	
	@RequestMapping("viewMovie")
	public ModelAndView getViewMovie()
	{
		ModelAndView mv = new ModelAndView("viewMovie");
		List<Movie> li = mdoa.findAll();
		mv.addObject("view", li);
		return mv;
	}
	
}
