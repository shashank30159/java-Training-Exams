package com.vm.training.java.exam;

public class EmployelessthanThree extends Exception{
	
	String message;
	 EmployelessthanThree(String message)
	{
		this.message=message;
	}
	
	public String toString() {
		return message;
	}
}