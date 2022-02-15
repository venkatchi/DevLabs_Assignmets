package com.devlabs.lab1;

public class callingMethods {
	
	static callingMethods call = new callingMethods();
	public void sum()
	{
		int a=10, b=20, c;
		
		c= a+20;
		System.out.println(c);
	}
	
	public static void main(String args[])
	{
		call.sum();
	}
	

}
