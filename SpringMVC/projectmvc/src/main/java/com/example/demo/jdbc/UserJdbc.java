package com.example.demo.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public class UserJdbc {
	
	public List<User> getAllUser()
	{
		List<User> li = new ArrayList<User>();
		li.add(new User("Jhanvi","jd@gmail.com","123234","Guj"));
		li.add(new User("Ishita","ij@gmail.com","938248","Surat"));
		return li;
	}
}
