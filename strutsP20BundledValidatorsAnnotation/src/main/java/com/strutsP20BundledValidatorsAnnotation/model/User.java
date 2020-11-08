
package com.strutsP20BundledValidatorsAnnotation.model;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.DateRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.DoubleRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.FieldExpressionValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.UrlValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import com.strutsP20BundledValidatorsAnnotation.dao.UserDao;

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


	@RequiredFieldValidator(type = ValidatorType.SIMPLE, fieldName = "gender",
			message = "Gender is required")
	public void setGender(String gender) {
		this.gender = gender;
	}



	public Date getDob() {
		return dob;
	}

	@RequiredFieldValidator(type = ValidatorType.FIELD, fieldName = "dob",
			message = "Dob is required")
	@DateRangeFieldValidator(type = ValidatorType.FIELD, fieldName = "dob",
			min = "01/01/1980", max = "01/01/2020", dateFormat = "dd/MM/yyyy",
			message = "DOB must be between ${min} and ${max}")
	public void setDob(Date dob) {
		this.dob = dob;
	}



	public String getUrl() {
		return url;
	}

	@RequiredStringValidator(type = ValidatorType.FIELD, fieldName = "url",
			message = "URL is required")
	@UrlValidator(type = ValidatorType.FIELD, fieldName = "url",
			message = "URL must be correct e.g. http://www.javatpoint.com")
	public void setUrl(String url) {
		this.url = url;
	}



	public String getPassword() {
		return password;
	}


	@RequiredStringValidator(type = ValidatorType.FIELD, fieldName = "password",
			message = "password must be required")
	@StringLengthFieldValidator(type = ValidatorType.FIELD, fieldName = "password",
			minLength = "8", maxLength = "32",
			message = "Password must be between ${minLength} and ${maxLength}")
	public void setPassword(String password) {
		this.password = password;
	}



	public String getcPassword() {
		return cPassword;
	}


	@RequiredStringValidator(type = ValidatorType.FIELD, fieldName = "cPassword",
			message = "password must be required")
	@StringLengthFieldValidator(type = ValidatorType.FIELD, fieldName = "cPassword",
			minLength = "8", maxLength = "32",
			message = "Password must be between ${minLength} and ${maxLength}")
	@FieldExpressionValidator(fieldName = "cPassword",expression = "(password == cPassword )",
			message = "password and Re-entered password must be same.")
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}



	public int getAge() {
		return age;
	}


	@IntRangeFieldValidator(type = ValidatorType.SIMPLE, fieldName = "age", 
			min = "18", max = "60", 
			message = "Age must be between ${min} and ${max}")
	public void setAge(int age) {
		this.age = age;
	}



	public long getMobileno() {
		return mobileno;
	}


	@StringLengthFieldValidator(type = ValidatorType.FIELD, fieldName = "mobileno",
			minLength = "10", maxLength = "10", 
			message = "Mobile Number Must be 10 digit")
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}



	public double getHeight() {
		return height;
	}


	@DoubleRangeFieldValidator(type = ValidatorType.FIELD, fieldName = "height",
			minInclusive = "4", maxExclusive = "10",
			message = "Height must be between ${minInclusive} and ${maxExclusive}")
	public void setHeight(double height) {
		this.height = height;
	}

	@Validations(
			requiredStrings = {
					@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "username", trim = true, message = "username is required"),
					@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "emailid", trim = true, message = "emailid is required")		
			},
			regexFields = {
					@RegexFieldValidator( type = ValidatorType.FIELD, fieldName = "email", regexExpression = "[A-Za-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}", message = "Invalid Email Id")
			}
	)

	public String execute() {
		String result = ERROR;
		System.out.print("err");
		User user = new User(username, emailid, gender, dob, url, password, cPassword, age, mobileno, height);
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
