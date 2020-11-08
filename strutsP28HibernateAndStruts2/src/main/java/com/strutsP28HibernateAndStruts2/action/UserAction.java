package com.strutsP28HibernateAndStruts2.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.strutsP28HibernateAndStruts2.dao.UserDao;
import com.strutsP28HibernateAndStruts2.model.User;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport implements ModelDriven<User> {

	private User user;
	private List<User> usersList = new ArrayList<User>();
	private String dbType = "Hibernate"; // Hibernate , JPA
	
	@Override
	public User getModel() {
		return user = new User();
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return user;
	}
	
	public String execute() {
		System.out.println("\nexecute()\n");
		String result = ERROR;
		if( UserDao.checkUser(user.getMobileno(), user.getEmailid(), dbType) ) {
			System.out.print("input");
			addActionError("Mobile number or email id already exist");
			result = INPUT;
		}
		else if( UserDao.addUser(user, dbType) ) {
			System.out.print("success");
			result = SUCCESS;
		}
		return result;
	}

	public String userList() {
		System.out.println("\nuserList()\n");
		setUsersList(UserDao.getUserList( dbType));
		return SUCCESS;
	}
	
	public void setUsersList(List<User> usersList) {
		this.usersList = usersList;
	}
	
	public List<User> getUsersList() {
		return usersList;
	}
	
}
