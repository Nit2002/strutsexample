package com.strutsP26DataTags.model.property_push_set;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class SystemDetails extends ActionSupport {
	private Environment environment = new Environment("Development","1");
	private String os = "Windows 7 or 10";
	
	public String execute() {
		return SUCCESS;
	}

	public Environment getEnvironment() {
		return environment;
	}

	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	
	
}
