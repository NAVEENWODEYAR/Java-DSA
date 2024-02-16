package com.dsa.searching;

public class LinerarSearch {
    
    static int linearSearch(int ele,int[] arr) {
	
	if(arr.length==0)
	    return -1;
	for(int i=0; i<arr.length; i++) {
	    if(arr[i]==ele) {
		return arr[i];
	    }
	}
	return Integer.MAX_VALUE;
    }
    
    static boolean linearSearch1(int[] arr,int ele) {
	if(arr.length==0)
	    return false;
	for(int i=0; i<arr.length; i++) {
	    if(arr[i]==ele)
		return true;
	}
	return false;
    }
    public static void main(String[] args) {
	System.out.println("********");
	int loc = linearSearch(5, new int[]{1,2,3,4,5});
	System.out.println("Element found at the location "+loc);
	boolean result = linearSearch1(new int[] {2,4,6,8,10}, 8);
	System.out.println(result);
	
    }
}
