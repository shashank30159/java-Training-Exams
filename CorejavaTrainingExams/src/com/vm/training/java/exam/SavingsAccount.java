package com.vm.training.java.exam;

public class SavingsAccount {
	private double balance;
	private double interest;

	public SavingsAccount(int balance, double interest) {
		super();
		this.balance = balance;
		this.interest = interest;
	}
	public void deposit(int amount)
	{
		balance =balance + amount;
	}

	public void withdraw(int amount)
	{
		balance =balance - amount;
	}

	public void addInterest()
	{
		balance =(balance + balance * interest);
	}

	public double getBalance()
	{
		return balance;
	}


}
