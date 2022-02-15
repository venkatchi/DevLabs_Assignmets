package com.java_assignments.assignment3;

import java.util.HashMap;

public class OccuranceOfCharInString {

	public static void main(String[] args) {
		 String str = "�DevLabs Alliance Training";
		 
	      HashMap <Character, Integer> hMap = new HashMap<>();
	      for (int i = str.length() - 1; i >= 0; i--) {
	         if (hMap.containsKey(str.charAt(i))) {
	            int count = hMap.get(str.charAt(i));
	            hMap.put(str.charAt(i), ++count);
	         } else {
	            hMap.put(str.charAt(i),1);
	         }
	      }
	      System.out.println(hMap);

	}

}

