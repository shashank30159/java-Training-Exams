package com.vm.training.java.exam;

public class TestSavingsAccount {

	public static void main(String[] args) {
		SavingsAccount savings=new SavingsAccount(5000,0.06);
		savings.withdraw(1000);
		savings.deposit(1500);
		System.out.println("Current Balance in Saving Account :"+savings.getBalance());
		
	}

}
