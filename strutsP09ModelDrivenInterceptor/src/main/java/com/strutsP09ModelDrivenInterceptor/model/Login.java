package com.strutsP09ModelDrivenInterceptor.model;

import com.opensymphony.xwork2.ModelDriven;

public class Login implements ModelDriven<User>{
	
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getModel() {
		user = new User();
		return user;
	}
	
	
	public String execute() {
		System.out.println(user);
		if( user.getUsername() == null || user.getPassword() == null ) {
			return "error";
		}
		else if( user.getUsername().equals("Admin") && user.getPassword().equals("Admin") ) {
			return "success";
		}
		else {
			return "error";
		}
	}
	
}
