package org.jagjeet.bankingsystem.dao;

import org.jagjeet.bankingsystem.model.User;

public interface UserDao {

	public int addAccount(User user);

	public int removeAccount(User user);

}
