package com.strutsP28HibernateAndStruts2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Users")
public class User  { 

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id;
	@Column(name = "Username" ,length = 20 )
	private String username;
	@Column(name = "Email" ,length = 20 )
	private String  emailid;
	@Column(name = "Gender" ,length = 20 )
	private String  gender;
	@Column(name = "Age" ,length = 20 )
	private int age;
	@Column(name = "MobileNo" ,length = 20 )
	private long mobileno;
	
	public User() {}
	
	public User(String username, String emailid, String gender, int age, long mobileno) {
		this.username = username;
		this.emailid = emailid;
		this.gender = gender;
		this.age = age;
		this.mobileno = mobileno;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
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
	
}
