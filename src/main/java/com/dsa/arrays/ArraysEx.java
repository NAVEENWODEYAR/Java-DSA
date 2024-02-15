package com.dsa.arrays;

import java.util.Arrays;

public class ArraysEx {
    /**
     * array & arrayList,
     */
    static void arraysDisplay() {
	int[] regNumbers = {1,2,3,4,5,};
	String studentNames[] = {"A","S","D","F"};
	System.out.println(java.util.Arrays.toString(regNumbers));
	System.out.println(Arrays.toString(studentNames));
    }
    public static void main(String[] args) {
	System.out.println("Arrays");
	 arraysDisplay();
    }

}
