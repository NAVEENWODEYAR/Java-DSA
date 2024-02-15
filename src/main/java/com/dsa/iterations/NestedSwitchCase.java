package com.dsa.iterations;

import java.util.Scanner;

public class NestedSwitchCase {

    /**
     *Nested switch case, 
     */
    public static void main(String[] args) {
	System.out.println("**********");
	Scanner sc = new Scanner(System.in);
	System.out.println("\nEnter student details:");
	  char branch = sc.next().trim().charAt(0);               
	  int collegeYear = sc.nextInt();
	        switch( collegeYear ) {  
	            case 1:  
	                System.out.println("English, Maths, Science");  
	                break;  
	            case 2:  
	                switch( branch )   
	                {  
	                    case 'C':  
	                        System.out.println("Operating System, Java, Data Structure");  
	                        break;  
	                    case 'E':  
	                        System.out.println("Micro processors, Logic switching theory");  
	                        break;  
	                    case 'M':  
	                        System.out.println("Drawing, Manufacturing Machines");  
	                        break;  
	                }  
	                break;  
	            case 3:  
	                switch( branch )   
	                {  
	                    case 'C':  
	                        System.out.println("Computer Organization, MultiMedia");  
	                        break;  
	                    case 'E':  
	                        System.out.println("Fundamentals of Logic Design, Microelectronics");  
	                        break;  
	                    case 'M':  
	                        System.out.println("Internal Combustion Engines, Mechanical Vibration");  
	                        break;  
	                }  
	                break;  
	            case 4:  
	                switch( branch )   
	                {  
	                    case 'C':  
	                        System.out.println("Data Communication and Networks, MultiMedia");  
	                        break;  
	                    case 'E':  
	                        System.out.println("Embedded System, Image Processing");  
	                        break;  
	                    case 'M':  
	                        System.out.println("Production Technology, Thermal Engineering");  
	                        break;  
	                }  
	                break;  
	        }  
	   
    }

}
