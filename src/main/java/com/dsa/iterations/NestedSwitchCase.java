package com.dsa.iterations;

import java.util.Scanner;

public class NestedSwitchCase {

    /**
     *Nested switch case, 
     */
    public static void main(String[] args) {
	System.out.println("**********");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter id and dept");
	int empId = sc.nextInt();
	String empDept = sc.next();
	
	switch (empId) {
	case 1:
	    System.out.println("CEO");
	    break;
	case 2:
	    System.out.println("COO");
	    break;
	case 3:
	    System.out.println("CTO");
	case 4:
	    switch (empDept) {
	    case "IT":
		System.out.println("Information Technology");
		break;
	    case "HR" :
		System.out.println("Human Resource");
		break;
	    default:
		System.out.println("Invalid choice");
	    }
	default:
	    System.out.println("Enter valid option");
	}
    }

}
