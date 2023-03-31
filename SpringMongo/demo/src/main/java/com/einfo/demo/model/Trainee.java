package com.einfo.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Trainee {
	
	@Id
	private int t_Id;
	private String traineeName;
	private String location;
	
	public Trainee() {
		super();
	}
	public Trainee(int t_Id, String traineeName, String location) {
		super();
		this.t_Id = t_Id;
		this.traineeName = traineeName;
		this.location = location;
	}
	public int getT_Id() {
		return t_Id;
	}
	public void setT_Id(int t_Id) {
		this.t_Id = t_Id;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Trainee [t_Id=" + t_Id + ", traineeName=" + traineeName + ", location=" + location + "]";
	}
	
}
