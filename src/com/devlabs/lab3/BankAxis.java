package com.devlabs.lab3;

public class BankAxis implements BankInterface
{
	
	static int a;
	static int b;
	//static int c;

	public void rateOfInterest(int a , int b)
	{
		System.out.println("rate of interest is :" + (a+b)/2);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BankAxis ab = new BankAxis();
		ab.rateOfInterest(50, 60);
		
	}

}
