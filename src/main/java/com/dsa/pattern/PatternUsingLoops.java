package com.dsa.pattern;

import java.util.Scanner;

public class PatternUsingLoops {

    /*
     * This method prints a square pattern.
     *
     * For example, if n = 3:
     *
     * * * *
     * * * *
     * * * *
     *
     * Actually, because the loops use < n,
     * it will print 3 rows and 3 columns.
     */
    static void pattern1(int n) {

        // Outer loop controls the number of rows
        for (int i = 0; i < n; i++) {

            // Inner loop controls the number of columns
            for (int j = 0; j < n; j++) {

                // Print star on the same line
                System.out.print("* ");
            }

            // Move to the next line after one complete row
            System.out.println();
        }
    }

    
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        /*
         * First input represents the number of test cases.
         *
         * Example:
         * 3
         *
         * This means we want to run our pattern program 3 times.
         */
        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        /*
         * Loop through all test cases.
         *
         * If t = 3, this loop runs 3 times:
         * Test Case 1
         * Test Case 2
         * Test Case 3
         */
        for (int testCase = 1; testCase <= t; testCase++) {

            System.out.println("Enter the input for the loop: ");
            int n = sc.nextInt();
            // Call the pattern method
            pattern1(n);

            // Print an empty line between test cases
            System.out.println();
        }

        // Close the Scanner object
        sc.close();
    }
}
