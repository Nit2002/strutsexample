package com.strutsP16ServletContextAware.model;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

public class Success1 implements ServletContextAware {
	
	public String execute() {
		return "success";
	}

	@Override
	public void setServletContext(ServletContext context) {
		context.setAttribute("username", "manish");
	}
	
}
