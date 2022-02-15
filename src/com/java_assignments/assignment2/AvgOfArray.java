package com.java_assignments.assignment2;

import java.util.Scanner;

public class AvgOfArray {
	
		public static void main(String[] args) {
			 int[] arr = new int[5]; //declaration
		       
		    
		        double sum =0;
		        double avg;
		        
		        Scanner reader = new Scanner(System.in);
		        System.out.println("Enter the elements of the array");
		        
		        for(int i=0;i<5;i++)
		        {
		            arr[i] = reader.nextInt();
		        }
		        
		        reader.close();
		        
		        //5 elements - 0 to 4
		          for(int i=0;i<arr.length;i++)
		          {
		              sum = sum + arr[i]; 
		         
		          }
		         avg=sum/arr.length;
		     
		        System.out.println("Sum is " +sum);
		        System.out.println("Avg is "+avg);

		}

	}

