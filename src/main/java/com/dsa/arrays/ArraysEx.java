package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEx {
    /**
     * array & arrayList,
     */
    static void arraysDisplay() {
	int[] regNumbers = {1,2,3,4,5,};
	String studentNames[] = {"A","S","D","F"};
	System.out.println(java.util.Arrays.toString(regNumbers));
	System.out.println(Arrays.toString(studentNames));
	
	// arrayList
	List<String> arrLst = Arrays.asList("Ammy","Bella","Clara","Dora");
	System.out.println(arrLst);
	ArrayList<Integer> numLst = new ArrayList<>(5);
			   numLst.add(0);
			   numLst.add(2);
			   numLst.add(4);
			   numLst.add(8);
	System.out.println(numLst);
	numLst.forEach(System.out::println);
			   
    }
    
    public static void main(String[] args) {
	System.out.println("Arrays");
	 arraysDisplay();
    }

}
