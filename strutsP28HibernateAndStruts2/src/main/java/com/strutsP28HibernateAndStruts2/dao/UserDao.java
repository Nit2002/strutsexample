package com.strutsP28HibernateAndStruts2.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.strutsP28HibernateAndStruts2.comman.Database;
import com.strutsP28HibernateAndStruts2.model.User;

public class UserDao {
	
	public static boolean checkUser(long mobileno, String email, String dbType) {
		boolean result = false;
		
		try {
			if( dbType.equalsIgnoreCase( "Hibernate" ) ) {
				Session session = (Session) Database.getDBConnection( dbType );
				Query query = session.createQuery("FROM User u WHERE u.emailid = :email OR u.mobileno = :mobileno ");
				query.setParameter("email", email);
				query.setParameter("mobileno", mobileno);
				if(  query.list().size() > 0 ) {
					result = true;
				}
				session.flush();
			}
			else if( dbType.equalsIgnoreCase( "JPA" ) ) {
				EntityManager manager = (EntityManager) Database.getDBConnection( dbType );
				javax.persistence.Query query = manager.createQuery("FROM User WHERE emailid = :email OR mobileno = :mobileno ");
				query.setParameter("email", email);
				query.setParameter("mobileno", mobileno);
				if( query.getResultList().size() > 0 ) {
					result = true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static boolean addUser(User user, String dbType) {
		boolean result = false;
		try {
			if( dbType.equalsIgnoreCase( "Hibernate" ) ) {
				Session session = (Session) Database.getDBConnection( dbType );
				Transaction tx = session.beginTransaction();
				int id = (int) session.save(user);
				if( id > 0 ) {
					result = true;
				}
				tx.commit();
				session.flush();
			}
			else if( dbType.equalsIgnoreCase( "JPA" ) ) {
				EntityManager manager = (EntityManager) Database.getDBConnection( dbType );
				EntityTransaction tx = manager.getTransaction();
				tx.begin();
				manager.persist(user);
				if( user.getId() > 0  ) {
					result = true;
				}
				tx.commit();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public static List<User> getUserList(String dbType) {
		List<User> userList = new ArrayList<User>();
		try {
			if( dbType.equalsIgnoreCase( "Hibernate" ) ) {
				Session session = (Session) Database.getDBConnection( dbType );
				Query query = session.createQuery(" FROM User ");
				userList = query.list();
			}
			else if( dbType.equalsIgnoreCase( "JPA" ) ) {
				EntityManager manager = (EntityManager) Database.getDBConnection( dbType );
				javax.persistence.Query query = manager.createQuery(" FROM User ");
				userList = query.getResultList();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}
	
}
