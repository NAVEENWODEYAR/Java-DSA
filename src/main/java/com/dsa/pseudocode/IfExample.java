
package com.dsa.pseudocode;

public class IfExample {
    /** 
     * PseuoCode for the program,
     * start
     * input sal
     * if sal > 10000
     * 	sal = sal + 20000
     * 	output "sal"
     * else
     * 	sal = sal + 1000
     * 	outprint "sal"
     * exit
     */
    static void calculateBonus(int sal) {
	if(sal > 10000)
	    System.out.println(sal = sal + 200);
	else
	    System.out.println(sal = sal + 100);
    }
    
    /**
     * nested-If
     */
    static void issueBonus(int sal) {
	if(sal > 10000)
	    System.out.println(sal+1000);
	else if(sal > 20000)
	    System.out.println(sal+2000);
	else if(sal > 30000)
	    System.out.println(sal+3000);
	else if(sal > 40000)
	    System.out.println(sal+5000);
	else
	    System.out.println("No bonus,");
    }
    
    public static void main(String[] args) {
	calculateBonus(9543);
	issueBonus(12345);
    }
}
