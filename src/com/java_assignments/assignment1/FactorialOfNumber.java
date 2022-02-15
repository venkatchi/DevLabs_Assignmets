package com.java_assignments.assignment1;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int number,i;
		double fact=1;
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the number to calculate factorial:");
		number=scanner.nextInt();
		for(i=1; i<=number;i++)
		{
			fact=fact*i;
		
		}
		System.out.println("The factorial of number is "+ fact);
		scanner.close();
	}

}

