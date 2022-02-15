package com.java_assignments.assignment1;

import java.util.Scanner;

public class ReverseArrayEx {
	public static void main(String[] args) {
	int[] arr;
	int counter=0;
    
    Scanner scanner = new Scanner(System.in);
	System.out.println("How many elements you want to enter: ");
	counter = scanner.nextInt();
	arr = new int[counter];
    
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter the elements of the array");
    
    for(int i=0;i<counter;i++)
    {
        arr[i] = reader.nextInt();
    }
    int arraySize = arr.length;
    
    reader.close();
    System.out.println("Given array of elements");
    for(int i=0; i<arraySize;i++)
    {
    	System.out.print(arr[i]+" ");
    }
    System.out.println();
      
      System.out.println("Reverse of an array elements");
   	   for(int i=arraySize-1;i>=0;i--)
   	   {
       
   		  System.out.print( arr[i]+" "); 
      
      }
     
     scanner.close();
}

}

