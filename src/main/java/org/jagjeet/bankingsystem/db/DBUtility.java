package org.jagjeet.bankingsystem.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtility {

	private static DBUtility dbUtility = null;
	private SessionFactory sessionFactory = null;

	private DBUtility() {

	}

	public static DBUtility getInstance() {
		if (dbUtility == null) {
			dbUtility = new DBUtility();
			dbUtility.sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		return dbUtility;
	}

	public Session getNewSession() {
		return sessionFactory.openSession();
	}
}