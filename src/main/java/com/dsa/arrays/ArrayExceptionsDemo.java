package com.dsa.arrays;

public class ArrayExceptionsDemo {

    public static void main(String[] args) {

        // 1. ArrayIndexOutOfBoundsException
        System.out.println("1. ArrayIndexOutOfBoundsException");

        int[] numbers = {10, 20, 30};

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
            System.out.println("Message: " + e.getMessage());
        }

        System.out.println();


        // 2. NullPointerException
        System.out.println("2. NullPointerException");

        int[] arr = null;

        try {
            System.out.println(arr[0]);
        } catch (NullPointerException e) {
            System.out.println("Error: Array reference is null!");
        }

        System.out.println();


        // 3. NegativeArraySizeException
        System.out.println("3. NegativeArraySizeException");

        try {
            int size = -5;
            int[] data = new int[size];
        } catch (NegativeArraySizeException e) {
            System.out.println(
                "Error: Array size cannot be negative!"
            );
        }

        System.out.println();


        // 4. ArrayStoreException
        System.out.println("4. ArrayStoreException");

        try {
            Object[] values = new String[3];
            values[0] = "Java";
            values[1] = 100;
        } catch (ArrayStoreException e) {
            System.out.println(
                "Error: Incompatible object stored in array!"
            );
        }

        System.out.println();


        // 5. Exception while iterating through an array
        System.out.println("5. Safe array traversal");

        int[] marks = {80, 90, 75};

        try {
            for (int i = 0; i <= marks.length; i++) {
                System.out.println(marks[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Error: Loop accessed an invalid index!"
            );
        }

        System.out.println();


        // 6. Correct way to access array elements
        System.out.println("6. Correct array traversal");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println();


        // 7. Handling multiple exceptions
        System.out.println("7. Multiple exception handling");

        int[] values = {1, 2, 3};

        try {
            System.out.println(values[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index handled!");
        } catch (NullPointerException e) {
            System.out.println("Null reference handled!");
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("\nProgram completed.");
    }
}
