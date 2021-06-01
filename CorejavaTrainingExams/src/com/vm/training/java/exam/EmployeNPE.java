package com.vm.training.java.exam;

public class  EmployeNPE extends Exception {
	  
	String message;
	EmployeNPE(String message)
	{
		this.message=message;
	}
	
	public String toString() {
		return message;
	}
}