package com.dsa.searching;

public class LinerarSearch {
    
    static void linearSearch(int n,int[] arr) {
	
	for(int i=0; i<arr.length; i++) {
	    if(arr[i]==n) {
		System.out.println("Element found at the location,"+i);
		break;
	    }
	    
	}
    }
    
    public static void main(String[] args) {
	System.out.println("********");
	linearSearch(5, new int[]{1,2,3,4,5});
    }

}
