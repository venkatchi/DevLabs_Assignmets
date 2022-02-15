package com.java_assignments.assignment4;


import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	public static void main(String a[])
	{
    ArrayList arrayList = new ArrayList();
    arrayList.add("Java");
    arrayList.add("C");
    arrayList.add("Selenium");
    arrayList.add("UFT");
    arrayList.add("Python");
    System.out.println("Before Reverse Order: " + arrayList);
    Collections.reverse(arrayList);
    System.out.println("After Reverse Order: " + arrayList);
 }
}

