package com.strutsP14AjaxValidation_JsonValidationInterceptor.model;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.strutsP14AjaxValidation_JsonValidationInterceptor.dao.UserDao;

@SuppressWarnings("serial")
public class User extends ActionSupport { 
	
	private String username, emailid, gender, url, password, cPassword;
	private int age;
	private long mobileno;
	private double height;
	private Date dob;
	
	public User() {}

	public User(String username, String emailid, String gender, Date dob, String url, String password,
			String cPassword, int age, long mobileno, double height) {
		this.username = username;
		this.emailid = emailid;
		this.gender = gender;
		this.dob = dob;
		this.url = url;
		this.password = password;
		this.cPassword = cPassword;
		this.age = age;
		this.mobileno = mobileno;
		this.height = height;
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



	public Date getDob() {
		return dob;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getcPassword() {
		return cPassword;
	}



	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
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



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}

	

	public String execute() {
		String result = ERROR;
		System.out.print("err");
		User user = new User(username, emailid, gender, dob, url, password, cPassword, age, mobileno, height);
		if( UserDao.checkUser(mobileno, emailid) ) {
			addActionError("User Already Exists");
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
