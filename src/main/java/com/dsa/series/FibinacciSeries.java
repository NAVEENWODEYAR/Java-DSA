package com.dsa.series;

public class FibinacciSeries {
    /**
     * fiboNacci series, 
     */
    static void fiboNacciSeries(int n) {
	int a=0,b=1,c;
	System.out.print(a+" "+b);
	for(int i=0; i<=n; i++) {
	    c=a+b;
	    System.out.print(" "+c);
	    a=b;
	    b=c;
	}
    }
    
    public static void main(String[] args) {
	System.out.println("************");
	fiboNacciSeries(5);
    }

}
