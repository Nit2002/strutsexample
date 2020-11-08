package com.strutsP27ExceptionInterceptorAnnotation.model;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Results(value = {
		@Result(name = "myresult", location = "global_result.jsp" )
})
@ExceptionMappings( value = {
		@ExceptionMapping(result = "myresult" , exception = "java.lang.Exception")
})


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
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
	}
	
	@Action(value = "login_action", 
			interceptorRefs = {  @InterceptorRef("params"), @InterceptorRef("exception") },
			results = {
					@Result(name = "success", location = "success.jsp" ),
					@Result(name = "error", location = "error.jsp" )
			}
		)
	public String execute() {
		System.out.println(toString());
		/*if( username == null || password == null ) {
			return "error";
		}
		else */
		if( username.equals("Admin") && password.equals("Admin") ) {
			return "success";
		}
		else {
			return "error";
		}
	}
	
}
