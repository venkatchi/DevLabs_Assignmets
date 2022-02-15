package com.devlabs.lab2;

public class Swap
{

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c;
		System.out.println("Value of a before Swap is :" + a);
		System.out.println("Value of b before Swap is :" + b);
		c = a;
		a = b;
		b = c;
		System.out.println("Value of a after Swap is :" + a);
		System.out.println("Value of b after Swap is :" + b);
		
		
	}

}
