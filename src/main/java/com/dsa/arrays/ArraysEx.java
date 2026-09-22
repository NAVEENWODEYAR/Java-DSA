package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEx {
	
    /**
     * Array's & ArrayList,
     */
    static void arraysDisplay() {
	int[] regNumbers = {1,2,3,4,5,};
	String studentNames[] = {"A","S","D","F"};
	System.out.println("Integer array "+java.util.Arrays.toString(regNumbers));
	System.out.println("String array "+Arrays.toString(studentNames));
	
	// arrayList.,
	List<String> arrLst = Arrays.asList("Ammy","Bella","Clara","Dora","Emma");
	System.out.println("ArrayList "+arrLst);
	
	ArrayList<Integer> numLst = new ArrayList<>(5);
			   numLst.add(0);
			   numLst.add(2);
			   numLst.add(4);
			   numLst.add(8);
			   numLst.add(6);
			   
	ArrayList<Integer> numLst1 = new ArrayList<>(5);
			   numLst1.addAll(numLst);
			   
	System.out.println("\n*********\n");
	numLst.forEach(System.out::println);		   
    }
    
    public static void main(String[] args) {
	System.out.println("Arrays, ArrayList");
	 arraysDisplay();
    }

}
