package com.example.demo;

public class Register {
	
	private String name,email,pswd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public Register(String name, String email, String pswd) {
		super();
		this.name = name;
		this.email = email;
		this.pswd = pswd;
	}

	@Override
	public String toString() {
		return "Register [name=" + name + ", email=" + email + ", pswd=" + pswd + "]";
	}
	
}
