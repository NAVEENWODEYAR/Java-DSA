
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
	for(int i=2; i<n/2; i++) {
	    if(n%i ==0)
		System.out.println("Prime,");
	    else
		System.out.println("Not prime");
	}
    }
    
    public static void main(String[] args) {
	primeNumber(5);
    }

}
