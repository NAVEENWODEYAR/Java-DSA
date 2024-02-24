package com.dsa.iterations;

import java.util.Scanner;

public class SwitchStatements2 {
   
    //Switch conditions and statements,
    public static void main(String[] args) {
	System.out.println("*****");
	Scanner sc = new Scanner(System.in);
	System.out.println("\nEnter the day number to display its name:");
	int day = sc.nextInt();
	switch(day) {
	case 1:
	    System.out.println("Sunday");
	    break;
	case 2:
	    System.out.println("Monday");
	    break;
	case 3:
	    System.out.println("Tuesday");
	    break;
	case 4:
	    System.out.println("Wednesday");
	    break;
	case 5:
	    System.out.println("Thursday");
	    break;
	case 6:
	    System.out.println("Friday");
	    break;
	case 7:
	    System.out.println("Saturday");
	    break;
	default:
	    System.out.println("Invalid option "+day);
	}
    }

}
