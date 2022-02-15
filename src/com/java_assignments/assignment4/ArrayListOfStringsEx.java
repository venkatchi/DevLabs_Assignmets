package com.java_assignments.assignment4;

import java.util.*;

public class ArrayListOfStringsEx {

	public static void main(String[] args) {
		 ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("Telangana");
		   listofcountries.add("Shimla");
		   listofcountries.add("Chennai");
		   listofcountries.add("Delhi");

		  
		   System.out.println("Before Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}

		 
		   Collections.sort(listofcountries);

		 
		   System.out.println("After Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}

	}

}
