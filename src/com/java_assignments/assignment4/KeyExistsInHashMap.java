package com.java_assignments.assignment4;

import java.util.*;

public class KeyExistsInHashMap {

	public static void main(String[] args) {
		 //create HashMap object
	    HashMap hMap = new HashMap();
	   
	    //add key value pairs to HashMap
	    hMap.put("1","SDET");
	    hMap.put("2","Professional");
	    hMap.put("3","Course");
	    hMap.put("Java", "Language");
	   
	   
	   
	    boolean blnExists = hMap.containsKey("Java");
	    System.out.println("Key exists in HashMap ? : " + blnExists);
	  }
	

	}

