package com.java_assignments.assignment1;

public class PrimeNumbersEx {

	public static void main(String[] args) {
		{  
			int n=0,i=1,j,cp;  
			
			System.out.println("The first 10 prime numbers are:");
			while(n<10)  
			{  
			j=1;  
			cp=0;  
			while(j<=i)  
			{  
			if(i%j==0)  
			cp++;  
			j++;   
			}  
			
			
			if(cp==2)  
			{  
				
			System.out.print(" "+ i);  
			n++;  
			}  
			i++;  
			}  
			}  
			}  
}
