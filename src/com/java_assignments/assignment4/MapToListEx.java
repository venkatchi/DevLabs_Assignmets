package com.java_assignments.assignment4;

import java.util.*;

public class MapToListEx {

	public static void main(String[] args) {
		 Map<Integer, String> myMap = new HashMap<>();
	      myMap.put(1, "C");
	      myMap.put(2, "C++");
	      myMap.put(3, "Java");
	      myMap.put(4, "Python");
	      myMap.put(5,"Perl" );

	      ArrayList<Integer> keyList = new ArrayList<Integer>(myMap.keySet());
	      ArrayList<String> valueList = new ArrayList<String>(myMap.values());

	      System.out.println("contents of the list containing the keys the map ::"+keyList);
	      System.out.println("contents of the list containing values of the map ::"+valueList);
	   }
	

	}

