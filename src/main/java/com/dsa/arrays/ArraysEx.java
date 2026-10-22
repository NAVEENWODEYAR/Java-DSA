package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The <code>ArraysEx</code> class demonstrates fundamental operations 
 * on Java Arrays and Collections (specifically {@link ArrayList}), 
 * including initialization, conversion, copying, and iteration.
 * 
 * @author Your Name
 * @version 1.0
 */
public class ArraysEx {
	
    /**
     * Demonstrates core operations for both fixed-size Arrays and dynamic ArrayLists.
     * 
     * <h3>Complexity Analysis:</h3>
     * <ul>
     *   <li><strong>Overall Time Complexity:</strong> $O(N)$, where $N$ is the number of elements processed/iterated.</li>
     *   <li><strong>Overall Space Complexity:</strong> $O(N)$, auxiliary memory allocated for arrays and dynamic lists.</li>
     * </ul>
     * 
     * <h3>Operation Breakdown:</h3>
     * <ul>
     *   <li><strong>Primitive Array Init:</strong> Time $O(N)$, Space $O(N)$ (Contiguous memory allocation).</li>
     *   <li><strong>`Arrays.asList()`:</strong> Time $O(1)$, Space $O(1)$ (Wraps existing array without copying).</li>
     *   <li><strong>`ArrayList.add()`:</strong> Time $O(1)$ amortized ($O(N)$ worst-case when resizing), Space $O(1)$.</li>
     *   <li><strong>`ArrayList.addAll()`:</strong> Time $O(K)$, Space $O(K)$ where $K$ is the size of the source list.</li>
     *   <li><strong>`ArrayList.forEach()`:</strong> Time $O(N)$, Space $O(1)$ (Linear traversal).</li>
     * </ul>
     */
    static void arraysDisplay() {
        // 1. Fixed-size primitive integer array
        // Time Complexity: O(N), Space Complexity: O(N) [N = 5]
        int[] regNumbers = {1, 2, 3, 4, 5};
        
        // 2. Fixed-size String array
        // Time Complexity: O(N), Space Complexity: O(N) [N = 4]
        String[] studentNames = {"A", "S", "D", "F"};
        
        System.out.println("Integer array: " + Arrays.toString(regNumbers)); // Time: O(N)
        System.out.println("String array: " + Arrays.toString(studentNames));   // Time: O(N)
	
        // 3. Fixed-size list backed by an array
        // Time Complexity: O(1), Space Complexity: O(1)
        List<String> arrLst = Arrays.asList("Ammy", "Bella", "Clara", "Dora", "Emma");
        System.out.println("ArrayList (via Arrays.asList): " + arrLst);
	
        // 4. Dynamic ArrayList with initial capacity of 5
        // Time Complexity: O(1) per add (amortized), Space: O(Capacity)
        ArrayList<Integer> numLst = new ArrayList<>(5);
        numLst.add(0); // O(1)
        numLst.add(2); // O(1)
        numLst.add(4); // O(1)
        numLst.add(8); // O(1)
        numLst.add(6); // O(1)
			   
        // 5. Copying elements from numLst into numLst1 using addAll()
        // Time Complexity: O(K) [K = elements added], Space Complexity: O(K)
        ArrayList<Integer> numLst1 = new ArrayList<>(5);
        numLst1.addAll(numLst);
			   
        System.out.println("\n*********\n");
        
        // 6. Iterating through the ArrayList using a method reference
        // Time Complexity: O(N), Space Complexity: O(1)
        numLst.forEach(System.out::println);		   
    }
    
    /**
     * Simulates LeetCode-style test validation for array/list transformations.
     * Validates that copying and sorting behave as expected.
     * 
     * <h3>Complexity Analysis:</h3>
     * <ul>
     *   <li><strong>Time Complexity:</strong> $O(N)$ for list equality checks and string conversion.</li>
     *   <li><strong>Space Complexity:</strong> $O(N)$ for creating duplicate reference lists.</li>
     * </ul>
     */
    public static void runLeetCodeTestCases() {
        System.out.println("\n--- Running LeetCode-Style Test Cases ---");
        
        // Test Case 1: Verify ArrayList copy operation
        // Time Complexity: O(N), Space Complexity: O(N)
        ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5, 6));
        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5, 6));
        ArrayList<Integer> actualList = new ArrayList<>(inputList); // Copy constructor
        
        boolean test1Passed = actualList.equals(expectedList); // Time: O(N)
        System.out.println("Test Case 1 (ArrayList Copy): " + (test1Passed ? "PASSED" : "FAILED"));
        
        // Test Case 2: Array toString representation check
        // Time Complexity: O(N), Space Complexity: O(N) for string building
        int[] testArray = {10, 20, 30};
        String expectedString = "[10, 20, 30]";
        String actualString = Arrays.toString(testArray); // Time: O(N)
        
        boolean test2Passed = actualString.equals(expectedString);
        System.out.println("Test Case 2 (Array toString formatting): " + (test2Passed ? "PASSED" : "FAILED"));
    }

    /**
     * Main entry point of the program.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println("=== Arrays and ArrayList Demonstration ===");
        arraysDisplay();
        runLeetCodeTestCases();
    }
}