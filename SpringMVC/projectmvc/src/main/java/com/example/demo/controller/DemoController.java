package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.jdbc.UserJdbc;
import com.example.demo.model.User;

@RestController
public class DemoController {
	
	@RequestMapping("home")
	public ModelAndView getHome()
	{
		return new ModelAndView("home");
	}
	
	@RequestMapping("register")
	public ModelAndView getRegister()
	{
		return new ModelAndView("reg");
	}
	
//	@RequestMapping("checkUser")
//	public ModelAndView getData(@RequestParam("uname") String name)
//	{
//		System.out.println(name);
//		return null;
//	}
	
	@RequestMapping(value="checkUser",method = RequestMethod.POST)
	public ModelAndView getData(@RequestParam String uname,String uemail)
	{
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("value1", uname);
		mv.addObject("value2", uemail);
		System.out.println(uname);
		System.out.println(uemail);
		List<User> u = uj.getAllUser();
		System.out.println(u);
		return mv;
	}
	
	@Autowired
	UserJdbc uj;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		List<User> li = uj.getAllUser();
		return li;
	}
	
}
