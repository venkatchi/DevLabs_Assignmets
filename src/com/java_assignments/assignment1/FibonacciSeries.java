package com.java_assignments.assignment1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int fib=0, number,n1=0,n2=1;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number to print fibonacci series:");
		number=scanner.nextInt();
		
		System.out.print(n1 +",");
		System.out.print(n2);
		for(int i=2; i<number;i++)
		{
			fib=n1+n2;
	
			System.out.print( "," + fib  );
			n1=n2;
			n2=fib;
		}
		scanner.close();	
	}

}
