
package com.dsa.pseudocode;

public class PrimeNumber {
    /**
     * Start
     *  input num
     *  while num < 2 
     *  	if num%c=0
     *  		output "not prime"
     *  		exit
     *  	c = c+1
     *  end while
     *  output "prime number"
     *  exit
     */
    static void primeNumber(int n) {
	int flag=0;
	    if(n == 0 || n == 1)
		System.out.println(n+" is not prime,");
	    else {
		for(int i=2; i<n/2; i++) {
		    System.out.println(n+" is not prime");
		    flag=1;
		    break;
		}
	    }
	    if(flag == 0)
		System.out.println(n+" is prime number");
    }
    
    public static void main(String[] args) {
	primeNumber(5);
	primeNumber(20);
    }
}
