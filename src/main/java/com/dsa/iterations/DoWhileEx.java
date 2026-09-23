package com.dsa.iterations;

/**
 * Demonstrates the use of a do-while loop.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class DoWhileEx {

    /**
     * Demonstrates do-while loop.
     *
     * @param n the limit up to which numbers are printed
     */
    static void doWhileEx(int n) {

        /*
         * Initialize the counter.
         */
        int i = 0;

        /*
         * A do-while loop executes the statements
         * inside the loop at least once.
         *
         * First:
         *     print i
         *
         * Then:
         *     increment i
         *
         * Finally:
         *     check whether i <= n
         */
        do {

            System.out.print(i + " ");

            i++;

        } while (i <= n);

        /*
         * The loop stops when i becomes greater than n.
         */
    }

    public static void main(String[] args) {

        System.out.println("*********");

        /*
         * Calling the doWhileEx() method with n = 10.
         *
         * It prints numbers from 0 to 10.
         */
        doWhileEx(10);

        System.out.println();

        /*
         * =====================================================
         * TIME COMPLEXITY
         * =====================================================
         *
         * The loop executes approximately n + 1 times.
         *
         * For n = 10:
         *
         * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
         *
         * Therefore:
         *
         * Time Complexity = O(n)
         *
         *
         * =====================================================
         * SPACE COMPLEXITY
         * =====================================================
         *
         * Only one variable 'i' is used.
         *
         * No additional array, collection, or data structure
         * is created.
         *
         * Therefore:
         *
         * Space Complexity = O(1)
         * =====================================================
         */
    }
}