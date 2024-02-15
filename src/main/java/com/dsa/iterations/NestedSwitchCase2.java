package com.dsa.iterations;

import java.util.Scanner;

public class NestedSwitchCase2 {

    /**
     *Nested switch case, 
     */
    public static void main(String[] args) {
	System.out.println("**********");
	Scanner sc = new Scanner(System.in);
	
	System.out.println("\nEnter employee details:");
	  char dept = sc.next().trim().charAt(0);               
	  int level = sc.nextInt();
	  
	  switch (level) {
	case 1:
	    switch (dept) {
	    case 'C':
		System.out.println("CEO");
		break;
	    case 'T':
		System.out.println("CTO");
		break;
	    case 'O':
		System.out.println("COO");
		break;
	    default:
		System.out.println("Invalid choice");
	    }
	    break;
	case 2:
	    System.out.println("Manager level");
	    break;
	case 3:
	    System.out.println("Developers");
	    break;
	case 4:
	    System.out.println("Support");
	    break;
	default:
	    System.out.println("Invalid option");
	}
	          
    }

}
