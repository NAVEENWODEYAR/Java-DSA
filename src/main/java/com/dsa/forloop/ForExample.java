package com.dsa.forloop;

/**
 * for loop syntax,
 */
public class ForExample {
    
    /**
     *  print 1-10,
     */
    static void forLoopEx(int n) {
	for(int i=0; i<=n; i++)
	    System.out.print(i+" ");
    }
    public static void main(String[] args) {
	System.out.println("**********");
	forLoopEx(10);
    }
}
