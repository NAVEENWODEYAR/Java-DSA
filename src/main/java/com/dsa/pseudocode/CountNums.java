package com.dsa.pseudocode;

public class CountNums {
    
    /**
     * find the number of occurrences of an number,
     */
    static void numOccurrence(int n,int m) {
	int count=0;
	int rem = 0;
	while(n>0) {
	   rem = n%10;
	   if(rem ==m)
	       count++;
	   n=n/10;
	}
	System.out.println(count);
    }

    public static void main(String[] args) {
	System.out.println("***********");
	numOccurrence(1234324,4);
    }
}
