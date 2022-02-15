package com.java_assignments.assignment3;

public class NumberFormatExceptionEx {
	 private static final String inputString = "123.33";   
     
	    public static void main(String[] args) {  
	       try {  
	                 int a = Integer.parseInt(inputString);  
	       }catch(NumberFormatException nfe){  
	         System.err.println("Invalid string in argumment and please provide valid argument");  
	       //request for well-formatted string  
	       }  
	            }  

}
