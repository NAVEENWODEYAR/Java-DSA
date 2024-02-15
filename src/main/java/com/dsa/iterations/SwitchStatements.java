package com.dsa.iterations;

import java.util.Scanner;

public class SwitchStatements {
    /**
     * Switch conditions and statements,
     */
    public static void main(String[] args) {
	System.out.println("*****");
	Scanner sc = new Scanner(System.in);
	System.out.println("\nEnter the fruit:");
	String fruit = sc.nextLine();
	switch (fruit) {
	case "Mango": 
	    System.out.println("King,");
	    break;
	case "Apple": 
	    System.out.println("Shimla,");
	    break;
	case "Grape": 
	    System.out.println("Sweet & Sour,");
	    break;
	case "Watermelon": 
	    System.out.println("Red,");
	    break;
	case "Orange": 
	    System.out.println("Citric,");
	    break;
	case "Guava": 
	    System.out.println("Nutritious,");
	    break;
	default:
	    throw new IllegalArgumentException("Unexpected value: " + fruit);
	}
    }

}
