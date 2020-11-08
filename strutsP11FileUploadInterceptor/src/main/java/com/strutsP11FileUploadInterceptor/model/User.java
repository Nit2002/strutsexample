package com.strutsP11FileUploadInterceptor.model;

import java.io.File;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;

import com.opensymphony.xwork2.ActionSupport;
import com.strutsP11FileUploadInterceptor.dao.UserDao;

@SuppressWarnings("serial")
public class User extends ActionSupport { // implements Action
	//implements Action, Validateable, ValidationAware, TextProvider, LocaleProvider, Serializable
	private String username, emailid, gender;
	private int age;
	private long mobileno;
	private File userimage;
	private String userimageFileName,userimageContentType, filePath, id;
	private String imageByte;
	
	public User() {}

	public User(String username, String emailid, String gender, int age, long mobileno, File userimage,
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
	
	public File getUserimage() {
		return userimage;
	}

	public void setUserimage(File userimage) {
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
	
	@Override
	public String toString() {
		return "User [username=" + username + ", emailid=" + emailid + ", gender=" + gender + ", age=" + age
				+ ", mobileno=" + mobileno + ", userimage=" + userimage + ", userimageFileName=" + userimageFileName
				+ ", userimageContentType=" + userimageContentType + "]";
	}
	

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	

	public String getImageByte() {
		return imageByte;
	}

	public void setImageByte(String imageByte) {
		this.imageByte = imageByte;
	}

	public String execute() {
		String result = ERROR;
		System.out.print(" "+toString());
		if( UserDao.checkUser(mobileno, emailid) ) {
			System.out.print("input");
			result = INPUT;
		}
		else{
			User user = new User(username, emailid, gender, age, mobileno, userimage, userimageFileName, userimageContentType);
			List<Object> listObject =  UserDao.addUser(user);
			if( ( (Integer) listObject.get(0) ) > 0 ) {
				id = listObject.get(1).toString();
				filePath = listObject.get(2).toString(); 
				imageByte =  Base64.encodeBase64String( (byte[]) listObject.get(3) ); 
				System.out.print("success");
				result = SUCCESS;
			}
			
		}
		return result;
	}

	
}
