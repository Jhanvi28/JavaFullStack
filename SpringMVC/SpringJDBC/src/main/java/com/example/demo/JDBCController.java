package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class JDBCController {

	@RequestMapping("/register")
	public ModelAndView getRegister()
	{
		return new ModelAndView("registration.jsp");
	}
	@RequestMapping("/dataIntoJdbc")
	public ModelAndView getDataOfUser(HttpServletRequest req)
	{
		ModelAndView mv = new ModelAndView("registration.jsp");
		String name = req.getParameter("uname");
		String mail = req.getParameter("uemail");
		String pswd = req.getParameter("pswd");
		Register e = new Register(name,mail,pswd);
		RegisterDAO rd = new RegisterDAO();
		rd.getData(e);
		
		return mv;
	}
}
