package com.java_assignments.assignment4;

import java.util.*;

public class HashSettoObjectArrayEx {

	public static void main(String[] args) {
		 Set<Integer> hs = new HashSet<Integer>();
	      hs.add(815);
	      hs.add(741);
	      hs.add(8288);
	      hs.add(8923);
	      hs.add(9115);
	      hs.add(96783);
	      hs.add(96447);
	      hs.add(92349);
	      System.out.println("Elements in set = "+hs);
	      System.out.println("Copying all elements...");
	      Object[] obArr = hs.toArray();
	      for (Object ob : obArr)
	      System.out.println(ob);

	}

}

