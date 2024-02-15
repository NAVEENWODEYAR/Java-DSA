package com.dsa.iterations;

public class LargetAmong3Numbers {
    /**
     * find the maximum number,
     */
    static void maxIn3Nums(int a, int b, int c) {
	if(a>b && a>c)
	    System.out.println(a+" is greater than,"+b+" and "+c);
	else if(b>c && b>a)
	    System.out.println(b+" is greater than,"+a+" and "+c);
	else
	    System.out.println(c+" is greater than "+a+" and "+b);
    }
    
    public static void main(String[] args) {
	System.out.println("*********");
	int a=5,b=4;
	maxIn3Nums(1, 2, 3);
	System.out.println(Math.max(a, b));
	// ternary operator,
	System.out.println((a>b?a:b));
    }
}
