package org.jagjeet.bankingsystem.dao;

import org.jagjeet.bankingsystem.model.Account;

public interface AccountDao {

	public int checkBalance(Account account);

	public int depositMoney(Account account);

	public int withdrawMoney(Account account);

	public int tranferMoney(Account account);

}
