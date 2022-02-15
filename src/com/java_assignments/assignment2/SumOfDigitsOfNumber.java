package com.java_assignments.assignment2;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		{
	        int num, n, sum = 0;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        num = scanner.nextInt();
	        while(num > 0)
	        {
	            n = num % 10;
	            sum = sum + n;
	            num = num / 10;
	        }
	        System.out.println("Sum of Digits: "+sum);
	        
	        scanner.close();
	    }
	}

	}

