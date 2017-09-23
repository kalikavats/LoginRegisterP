package com.jsf.loginRegisterP;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Login {

	private String username;
	private String password;
	private String message;
	
	public Login() {
		
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String loginValidate() {
		if (this.username.equals("admin") && this.password.equals("admin")) 
		{
		
		return "Login_response" ;
		} 
		else
		{
		this.message="Account is invalid";
		return "Failure";
		}
		}
	
	
	
}
