package com.dsa.iterations;

public class DoWhileEx {
    /**
     * do while loop,
     */
    static void doWhileEx(int n) {
	int i=0;
	do {
	    System.out.print(i);
	    i++;	    
	}
	while(i<=n);
    }
    
    public static void main(String[] args) {
	System.out.println("*********");
	doWhileEx(10);
    }
}
