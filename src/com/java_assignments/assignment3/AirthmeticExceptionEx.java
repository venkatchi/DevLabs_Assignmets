package com.java_assignments.assignment3;

public class AirthmeticExceptionEx {
	public static void main (String args[])
	{
		AirthmeticExceptionEx ae = new AirthmeticExceptionEx();
		ae.arithmeticExcepion(34);
	}
	ArithmeticException arithmeticExcepion(int n)
	{
		System.out.println("Number can't divided by 0 so will get Arithmetic Exception");
		int division = n/0;
		return null;
	}

}
