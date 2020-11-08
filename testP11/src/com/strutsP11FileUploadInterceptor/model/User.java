package com.strutsP11FileUploadInterceptor.model;

import javax.servlet.http.Part;

public class User {
	private String username, emailid, gender;
	private int age;
	private long mobileno;
	private Part userimage;
	private String userimageFileName,userimageContentType;
	
	public User() {}

	public User(String username, String emailid, String gender, int age, long mobileno, Part userimage,
			String userimageFileName, String userimageContentType) {
		this.username = username;
		this.emailid = emailid;
		this.gender = gender;
		this.age = age;
		this.mobileno = mobileno;
		this.userimage = userimage;
		this.userimageFileName = userimageFileName;
		this.userimageContentType = userimageContentType;
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

	public Part getUserimage() {
		return userimage;
	}

	public void setUserimage(Part userimage) {
		this.userimage = userimage;
	}

	public String getUserimageFileName() {
		return userimageFileName;
	}

	public void setUserimageFileName(String userimageFileName) {
		this.userimageFileName = userimageFileName;
	}

	public String getUserimageContentType() {
		return userimageContentType;
	}

	public void setUserimageContentType(String userimageContentType) {
		this.userimageContentType = userimageContentType;
	}
	
	

}
