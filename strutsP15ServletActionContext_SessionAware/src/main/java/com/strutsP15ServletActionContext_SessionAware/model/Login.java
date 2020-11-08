package com.strutsP15ServletActionContext_SessionAware.model;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class Login implements SessionAware {
	private String username,password;
	private SessionMap<String, Object> sessionMap;

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
	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap<String, Object>) session;
	}
	
	public String execute() {
		if( username.equals("Admin") && password.equals("Admin") ) {
			sessionMap.put("login", true);
			sessionMap.put("username", username);
			return "success";
		}
		else {
			return "error";
		}
	}

	public String logout() {
		if(sessionMap != null) {
			sessionMap.invalidate();
			sessionMap.clear();
		}
		return "success";
	}
	
}
