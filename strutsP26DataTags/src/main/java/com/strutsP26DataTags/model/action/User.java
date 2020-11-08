package com.strutsP26DataTags.model.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;


public class User {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String execute() {
		List<String> names = new ArrayList<String>();
		names.add("Manish");
		names.add("Ganesh");
		names.add("Sachin");
		names.add("Ram");
		ServletActionContext.getRequest().setAttribute("names", names);
		return "success";
	}
	
}
