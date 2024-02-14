package com.dsa.iterations;

public class WhileEx {
    /**
     * while loop syntax,
     */
    static void whileExample(int n) {
	int i=0;
	while(i <= n) {
	    System.out.print(i);
	    i++;
	}
    }
    public static void main(String[] args) {
	System.out.println("**********");
	whileExample(10);
    }
}
