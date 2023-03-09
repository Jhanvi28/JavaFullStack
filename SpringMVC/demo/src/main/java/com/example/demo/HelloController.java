package com.example.demo;

import java.net.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;



@Controller
public class HelloController {

	@RequestMapping("/index")
	public String getUserData()
	{
		return "register.jsp";
	}
	
	@RequestMapping("/data")
	public ModelAndView addData(HttpServletRequest req)
	{
		ModelAndView mv = new ModelAndView("success.jsp");
		String name = req.getParameter("uname");
		if(name.length()>=1)
		{
			mv.addObject("value1",name);
		}
		else
		{
			mv.addObject("value1","you entered less than one");
		}
		return mv;
		
	}
	
}
