package com.java_assignments.assignment4;

import java.util.Enumeration;
import java.util.Hashtable;

public class ViewOfKeysFromHashtable {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
	      ht.put("Fruit", "Apple");
	      ht.put("Vegetable", "Onions");
	      ht.put("Flower", "Rose");
	      Enumeration e = ht.keys();
	      
	      while (e.hasMoreElements()) {
	         System.out.println(e.nextElement());
	      }
	}

}

