package com.dsa.series;

import java.util.Arrays;

public class FibonacciSeries {

    /**
     * Returns the first n numbers of the Fibonacci series.
     *
     * Fibonacci series:
     * 0, 1, 1, 2, 3, 5, 8, 13...
     *
     * @param n number of Fibonacci numbers required
     * @return Fibonacci series as an array
     */
    public static int[] fibonacciSeries(int n) {

        // Handle invalid input
        if (n <= 0) {
            return new int[0];
        }

        // If only one number is required
        if (n == 1) {
            return new int[]{0};
        }

        // Create an array to store the result
        int[] result = new int[n];

        // First two Fibonacci numbers
        result[0] = 0;
        result[1] = 1;

        // Generate remaining Fibonacci numbers
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result;
    }

    public static void main(String[] args) {

        // Test cases
        int[] testCases = {0, 1, 2, 5, 10};

        // Run every test case using a loop
        for (int n : testCases) {

            int[] result = fibonacciSeries(n);

            System.out.println(
                    "Input: " + n +
                    " | Output: " + Arrays.toString(result)
            );
        }
    }
}