package com.strutsP15ServletActionContext_SessionAware.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class Profile extends ActionSupport {
	
	public String execute() {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		System.out.println(" session "+ session.getAttribute("login") != null );
		if( session.getAttribute("login") != null  ) {
			return "success";
		}
		else {
			addActionError("Your need to login first");
			return "input";
		}
		
	}
	
}
