package com.dsa.searching;

public class LinerarSearchInRange {
    
    static int linearSearch(int ele,int[] arr,int start,int end) {
	if(arr.length==0)
	    return -1;
	for(int i=start; i<end; i++) {
	    if(arr[i]==ele) {
		return arr[i];
	    }
	}
	return Integer.MAX_VALUE;
    }
    
    public static void main(String[] args) {
	int loc = linearSearch(5, new int[]{1,2,3,4,5},2,4);
	System.out.println("Element found at the location "+loc);
	
    }
}
