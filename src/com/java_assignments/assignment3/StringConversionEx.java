package com.java_assignments.assignment3;

public class StringConversionEx {

	public static void main(String[] args) {
		String str1 = "A brown fox";
		
		 char[] cha = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
		 
	      System.out.println("String: "+str1);
	      char[] ch = str1.toCharArray();
	      
	      System.out.println("Character Array...");
	      
	      for (int i = 0; i < ch.length; i++) {
	         System.out.print(ch[i]+" ");
	      }
	      
	   System.out.println();
	   System.out.println("character array to string  is");
	          String str = new String(cha);
	          System.out.println(str);
	     
	    
	       }
	    
	   }

