package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates how to avoid ConcurrentModificationException by creating an independent copy.
 */
public class ConcurrentModificationDemo {

    public static void main(String[] args) {
        // Initialize the master list
        List<String> masterList = new ArrayList<>(List.of("Apple", "Banana", "Cherry", "Date"));

        // FIX: Wrap subList in a new ArrayList to break the link and make a copy
        List<String> subList = new ArrayList<>(masterList.subList(1, 3)); 

        // Structurally modify the parent list (safe now because subList is independent)
        masterList.add("Elderberry");

        // Works successfully! Output: [Banana, Cherry]
        System.out.println(subList); 
    }
}