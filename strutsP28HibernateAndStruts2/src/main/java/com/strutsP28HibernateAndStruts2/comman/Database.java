package com.strutsP28HibernateAndStruts2.comman;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



public class Database {
	public static SessionFactory sf = null;
	public static Session session = null;
	public static EntityManagerFactory mf = null;
	public static EntityManager manager = null;
	
	public static Object getDBConnection(String dbType) {
		Object object = null;
		try {
			if( dbType.equalsIgnoreCase("Hibernate") ) {
				if( sf == null ) {
					Configuration con = new Configuration().configure();
					ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
					sf = con.buildSessionFactory(reg);
				}
				session = sf.openSession();
				object = session ;
			}
			else if( dbType.equalsIgnoreCase("JPA")  ) {
				if( mf == null ) {
					mf = Persistence.createEntityManagerFactory("unit1");
				}
				manager = mf.createEntityManager();
				object = manager;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return object;
	}

}
