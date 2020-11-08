package com.strutsP16ServletContextAware.model;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class Success2 extends ActionSupport {

	public String execute() {
		
		ServletContext servletContext = ServletActionContext.getServletContext();
		String username = (String) servletContext.getAttribute("username");
		if( username != null ) {
			return "success";
		}
		else {
			
			return "error";
		}
		
		
	}
}
