package com.java_assignments.assignment1;

import java.util.Scanner;

public class SortElementsOfArrayInAsc {
	public static void main(String[] args) {

	 int[] arr = new int[5]; //declaration
    int temp=0;
     
     Scanner reader = new Scanner(System.in);
     System.out.println("Enter the elements of the array");
     
     for(int i=0;i<5;i++)
     {
         arr[i] = reader.nextInt();
     }
     
     reader.close();
     
     //5 elements and its index is  0 to 4
       for(int i=0;i<arr.length;i++)
       {
    	   for(int j=i+1;j<arr.length;j++)
    	   {
        if(arr[i]>arr[j])
        {
        	temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    	   }
       }
       
       }
      System.out.println("The elements in asc order");
      for(int i=0;i<arr.length;i++)
    	  System.out.print(arr[i]+ " ");


}

}
