package com.strutsP26DataTags.model.date;

import java.util.Date;

public class CurrentDate {
	private Date currentDate;
	
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	
	public Date getCurrentDate() {
		return currentDate;
	}
	
	public String execute() {
	      setCurrentDate(new Date());
	      return "success";
	}
}
