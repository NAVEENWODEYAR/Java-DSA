package com.dsa.searching;

public class LinearSearchInString {

    static boolean isCharPresent(char ch,String st) {
	if(st.length()==0)
	    return false;
	for(int i=0; i<st.length();i++) {
	    if(st.charAt(i)==ch)
		return true;
	}
	return false;
    }
    public static void main(String[] args) {
	boolean result = isCharPresent('a', "String");
	if(result)
	    System.out.println("Present");
	else
	    System.out.println("Not present");
    }

}