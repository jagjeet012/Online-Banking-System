package org.jagjeet.bankingsystem.dao;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.jagjeet.bankingsystem.model.Account;

public class AccountDaoImpl implements AccountDao {

	@Override
	public int checkBalance(Account account) {
		Session session = null;
		Account balance = new Account();
		account.setUserId(100);
		account = session.get(Account.class, account.getUserId());
		System.out.println("Before Transaction: Balance = " + account.getAmount());

		double preBal = account.getAmount();
		account.setAmount(10000000);

		Transaction transaction = (Transaction) session.beginTransaction();
		session.update(account);

		account = session.get(Account.class, account.getUserId());
		System.out.println("After Transaction: Balance = " + account.getAmount());
		// transaction.commit();

		account = session.get(Account.class, account.getUserId());
		System.out.println("Pev-Bal=" + preBal + " Curr-Bal=" + account.getAmount());
		return 0;
	}

	@Override
	public int depositMoney(Account account) {
		Session session = null;
		Account balance = new Account();
		account.setUserId(100);
		account = session.get(Account.class, account.getUserId());
		System.out.println("Before Transaction: Balance = " + account.getAmount());
		account.setAmount(10000000);
		Transaction transaction = (Transaction) session.beginTransaction();
		session.update(account);
		account = session.get(Account.class, account.getUserId());
		System.out.println("After Transaction: Balance = " + account.getDeposit());
		// transaction.commit();
		account = session.get(Account.class, account.getUserId());
		Account preBal = account;
		System.out.println("Pev-Bal=" + preBal + " Curr-Bal=" + account.getDeposit());
		return 0;
	}

	@Override
	public int withdrawMoney(Account account) {
		Session session = null;
		Account balance = new Account();
		account.setUserId(100);
		account = session.get(Account.class, account.getUserId());
		System.out.println("Before Transaction: Balance = " + account.getAmount());
		account.setAmount(10000000);
		Transaction transaction = (Transaction) session.beginTransaction();
		session.update(account);
		account = session.get(Account.class, account.getUserId());
		System.out.println("After Transaction: Balance = " + account.getWithdraw());
		// transaction.commit();
		account = session.get(Account.class, account.getUserId());
		Account preBal = account;
		System.out.println("Pev-Bal=" + preBal + " Curr-Bal=" + account.getWithdraw());
		return 0;
	}

	@Override
	public int tranferMoney(Account account) {
		Session session = null;
		Account balance = new Account();
		account.setUserId(100);
		account = session.get(Account.class, account.getUserId());
		System.out.println("Before Transaction: Balance = " + account.getAmount());
		double preBal = account.getAmount();
		account.setAmount(10000000);
		Transaction transaction = (Transaction) session.beginTransaction();
		session.update(account);
		account = session.get(Account.class, account.getUserId());
		System.out.println("After Transaction: Balance = " + account.getAmount());
		// transaction.commit();
		account = session.get(Account.class, account.getUserId());
		System.out.println("Pev-Bal=" + preBal + " Curr-Bal=" + account.getAmount());
		return 0;
	}

}
