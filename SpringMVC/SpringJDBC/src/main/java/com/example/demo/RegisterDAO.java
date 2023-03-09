package com.example.demo;

import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class RegisterDAO {

	
	
	public boolean getData(Register r)
	{
		try
		{
			java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","root");
			System.out.println("Connected");
			PreparedStatement ps = cn.prepareStatement("insert into registertable values(?,?,?)");
			ps.setString(1, r.getName());
			ps.setString(2, r.getEmail());
			ps.setString(3, r.getPswd());
			System.out.println("data ");
			return ps.execute();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}
		
}
