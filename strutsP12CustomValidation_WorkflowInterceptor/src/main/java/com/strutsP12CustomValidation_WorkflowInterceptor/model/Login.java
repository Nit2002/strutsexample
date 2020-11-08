package com.strutsP12CustomValidation_WorkflowInterceptor.model;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class Login extends ActionSupport{
	private String username,password;

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
	
	@Override
	public void validate() {
		if(username.isEmpty() && password.isEmpty()) {
			addActionError("All Field is Empty.");
			System.out.println("All Field is Empty.");
		}
		else if( username.isEmpty() ) {
			addFieldError("username", "Username Field is Empty.");
		}
		else if( password.isEmpty() ) {
			addFieldError("password", "Password Field is Empty.");
		}
		else if( password.length() < 8 ) {
			addFieldError("password", "Password Must Be minmum 8 digit.");
		}
	}
	
	public String execute() {
		
		if( username.equals("Admin") && password.equals("Admin123") ) {
			return "success";
		}
		else {
			return "error";
		}
	}
	
}
