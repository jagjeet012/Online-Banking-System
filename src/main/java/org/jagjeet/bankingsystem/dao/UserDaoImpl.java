package org.jagjeet.bankingsystem.dao;

import org.hibernate.Session;
import org.jagjeet.bankingsystem.db.DBUtility;
import org.jagjeet.bankingsystem.model.User;

public class UserDaoImpl implements UserDao {

	DBUtility dbu = DBUtility.getInstance();

	@Override
	public int addAccount(User user) {
		Session session = null;
		try {
			session = dbu.getNewSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("account added succesfully");
			return 0;
		}

		session.close();
		return 1;

	}

	@Override
	public int removeAccount(User user) {
		Session session = null;
		try {
			session = dbu.getNewSession();
			session.beginTransaction();
			session.update(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("account removed successfully");
			return 0;
		}
		// session.flush();
		session.close();
		return 1;
	}

}
