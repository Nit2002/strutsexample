package com.strutsP08PrepareInterceptor.model;

import com.opensymphony.xwork2.Preparable;

public class Login implements Preparable{
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
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
	}

	@Override
	public void prepare() throws Exception {
		
		if( username != null || password != null ) {
			username = username.replace(" ", "");
			password = password.replace(" ", "");
			char[] uname = username.toCharArray();
			if(uname.length != 0 ) {
				uname[0] = Character.toUpperCase( uname[0]);
			}
			username = new String( uname );
			char[] pword = password.toCharArray();
			if(pword.length != 0 ) {
				pword[0] = Character.toUpperCase( pword[0]);
			}
			password = new String( pword );
		}
	}
	
	public String execute() {
		if( username == null || password == null ) {
			return "error";
		}
		else if( username.equals("Admin") && password.equals("Admin") ) {
			return "success";
		}
		else {
			return "error";
		}
	}
	
	
	
	
}
