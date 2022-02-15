package com.java_assignments.assignment3;

public class RethrowException {
	
	public static void test1() throws Exception 
	{
	      System.out.println("The Exception occured in test1() method");
	      throw new Exception("thrown from  the test1() method");
	   }
	   public static void test2() throws Throwable {
	      try
	      {
	         test1();
	      }
	      catch(Exception e)
	      {
	         System.out.println("Inside the test2() method");
	         throw e;
	      }
	   }
	   public static void main(String[] args) throws Throwable {
	      try
	      {
	         test2();
	      }
	      catch(Exception e) 
	      {
	         System.out.println("Exception Caught in main method");
	      }
	   }

}

