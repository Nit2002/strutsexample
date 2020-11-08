package com.strutsP17i18nInterceptor.model;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class Login extends ActionSupport {
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
