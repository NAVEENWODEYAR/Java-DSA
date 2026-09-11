package com.dsa.pseudocode;

import java.util.Scanner;

public class Calculator {
    /**
     * Calculator ex,
     */
    static void calci() {
	Scanner sc = new Scanner(System.in);
	int dis=0;
	
	while(true) {
     System.out.println("Calculator Program");
	    System.out.println("Enter the operator:");
	    char op = sc.next().trim().charAt(0);
	    
	    if(op == '+' || op =='-' || op =='*' || op =='/' || op =='%') {
		System.out.println("\nEnter the numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(op == '+') {
		    dis=a+b;
		}
		if(op == '-') {
		    dis=a-b;
		}
		if(op == '*') {
		    dis=a*b;
		}
		if(op == '%') {
		    dis=a%b;
		}
		if(op == '/') {
		    if(b!=0)
			dis=a+b;
		}
	    }
	    else if(op =='x' || op =='X') {
		break;
	    }else
	    {		
		System.out.println("\n Invalid choice");
	    }
	    System.out.println(dis);
	}
    }
    public static void main(String[] args) {
	System.out.println("**********");
	calci();
    }

}
