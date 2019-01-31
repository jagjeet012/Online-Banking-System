package org.jagjeet.bankingsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue
	int userId;
	String userName;
	String accountNumber;
	float amount;
	float deposit;
	float withdraw;
	float tranfer;

	public Account() {

	}

	public Account(int userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}

	public Account(int userId, String userName, String accountNumber, float amount, float deposit, float withdraw,
			float tranfer) {
		this.userId = userId;
		this.userName = userName;
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.tranfer = tranfer;

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public float getDeposit() {
		return deposit;
	}

	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}

	public float getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(float withdraw) {
		this.withdraw = withdraw;
	}

	public float getTranfer() {
		return tranfer;
	}

	public void setTranfer(float tranfer) {
		this.tranfer = tranfer;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}
