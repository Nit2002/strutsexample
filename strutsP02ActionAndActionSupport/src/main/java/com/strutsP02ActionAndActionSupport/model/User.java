package com.strutsP02ActionAndActionSupport.model;

import com.opensymphony.xwork2.ActionSupport;
import com.strutsP02ActionAndActionSupport.dao.UserDao;

@SuppressWarnings("serial")
public class User extends ActionSupport { // implements Action
	//implements Action, Validateable, ValidationAware, TextProvider, LocaleProvider, Serializable
	private String username, emailid, gender;
	private int age;
	private long mobileno;
	
	public User() {}
	
	public User(String username, String emailid, String gender, int age, long mobileno) {
		this.username = username;
		this.emailid = emailid;
		this.gender = gender;
		this.age = age;
		this.mobileno = mobileno;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	
	public String execute() {
		String result = ERROR;
		System.out.print("err");
		User user = new User(username, emailid, gender, age, mobileno);
		if( UserDao.checkUser(mobileno, emailid) ) {
			System.out.print("input");
			result = INPUT;
		}
		else if( UserDao.addUser(user) ) {
			System.out.print("success");
			result = SUCCESS;
		}
		return result;
	}
	
	
}
