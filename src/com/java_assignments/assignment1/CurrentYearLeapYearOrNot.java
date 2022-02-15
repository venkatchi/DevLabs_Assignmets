package com.java_assignments.assignment1;

import java.util.*;

public class CurrentYearLeapYearOrNot {

	public static void main(String[] args) {
		int yearValue;
	      System.out.println("Enter an Year to check it is an leap year or not :: ");
	      Scanner scanner = new Scanner(System.in);
	      yearValue = scanner.nextInt();

	      if (((yearValue % 4 == 0) && (yearValue % 100!= 0)) || (yearValue%400 == 0))
	         System.out.println("The given year "+yearValue+" is Leap year");
	      else
	         System.out.println("The given year "+yearValue+" is not a Leap year");
	     
	      scanner.close();
	   }
	

	}
