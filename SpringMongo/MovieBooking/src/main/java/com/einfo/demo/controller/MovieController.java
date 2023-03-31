package com.einfo.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfo.demo.model.Ticket;
import com.einfo.demo.repository.TicketRepo;

@RestController
public class MovieController {
	
	@Autowired
	TicketRepo ticketRepo;
	
//	@RequestMapping("/add")
//	public String add() {
//		ticketRepo.save(new Ticket("9423","rrr","2032-12-22", "2323-12-11","10:20","23","economy","cash","123","success","230"));
//		return "ha";
//	
//	}
	
	@RequestMapping("showTickerPage")
	public ModelAndView getshowTickerPage()
	{
		return new ModelAndView("showticketpage");
	}
	
	@RequestMapping("checkSeats")
	public void checkSeats(@RequestParam String movielist,String mdate,String mtime,String economy,String platinum,String nseats)
	{	
		List<Ticket> li = ticketRepo.findAll();
		
	}
	
}
