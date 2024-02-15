package com.dsa.iterations;

public class SwitchStatements2 {
    /**
     * Switch conditions and statements,
     */
    static void switchStatement(int n,int m) {
	for(int i=0; i<=n; i++) {
	    System.out.print(i);
	    if(i==m)
		break;
	}
    }
    
    public static void main(String[] args) {
	System.out.println("*****");
	switchStatement(10, 5);
    }

}
