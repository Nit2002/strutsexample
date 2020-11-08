package com.strutsP09ModelDrivenInterceptor.model;


public class Login1{
	
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
