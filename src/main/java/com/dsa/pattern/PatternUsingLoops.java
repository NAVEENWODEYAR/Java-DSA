package com.dsa.pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PatternUsingLoops {

    /*
     * Prints a square star pattern.
     *
     * Example: n = 3
     *
     * * * 
     * * * 
     * * * 
     */
    static void pattern1(int n) {

        // Guard clause: reject invalid pattern sizes
        if (n < 0) {
            System.out.println("Error: Pattern size cannot be negative.");
            return;
        }

        // Outer loop controls rows
        for (int i = 0; i < n; i++) {

            // Inner loop controls columns
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Automatically closes Scanner when finished
        try (Scanner sc = new Scanner(System.in)) {

            // Guard clause: ensure input is available
            if (!sc.hasNextInt()) {
                System.out.println(
                    "Error: Please enter a valid integer for test cases."
                );
                return;
            }

            int t = sc.nextInt();

            // Guard clause: validate number of test cases
            if (t <= 0) {
                System.out.println(
                    "Error: Number of test cases must be positive."
                );
                return;
            }

            // Process each test case
            for (int testCase = 1; testCase <= t; testCase++) {

                System.out.println(
                    "Enter the pattern size for test case "
                    + testCase + ":"
                );

                // Guard clause: validate input availability and type
                if (!sc.hasNextInt()) {
                    System.out.println(
                        "Error: Expected an integer for pattern size."
                    );
                    return;
                }

                int n = sc.nextInt();

                // Guard clause: reject negative pattern sizes
                if (n < 0) {
                    System.out.println(
                        "Error: Pattern size cannot be negative."
                    );
                    return;
                }

                // Print the pattern
                pattern1(n);

                // Separate test cases
                System.out.println();
            }

        } catch (InputMismatchException e) {
            // Fallback for unexpected invalid numeric input
            System.out.println("Error: Invalid input format.");
        }
    }
}