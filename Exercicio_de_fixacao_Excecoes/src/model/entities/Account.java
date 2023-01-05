package model.entities;

import model.exceptions.DomainExceptions;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	//metodos
	
	public void withdraw(Double amount) throws DomainExceptions{
		double newbalance = 0;
		if (this.balance < amount) {
			throw new DomainExceptions("Not enough balance");
		}else if (amount > this.balance || amount > this.withdrawLimit) {
			throw new DomainExceptions("The amount exceeds withdwraw limit!");
		}else {
			this.balance = this.balance - amount;
		}
	}
	
	public String toString() {
		return "New balance: " + balance;
	}
}
