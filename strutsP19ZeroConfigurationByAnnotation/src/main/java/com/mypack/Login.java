package com.mypack;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;



@SuppressWarnings("serial")
@Action(value="login" , results = {
		@Result(name="success" , location = "/myResults/success.jsp" ),
		@Result(name = "error" , location = "/myResults/error.jsp") })

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
	
	public String execute() {
		if( username.equals("Admin") && password.equals("Admin") ) {
			return "success";
		}
		else {
			return "error";
		}
	}
	
}
