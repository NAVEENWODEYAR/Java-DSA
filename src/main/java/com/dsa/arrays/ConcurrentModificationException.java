package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates ConcurrentModificationException when a subList view 
 * is accessed after structurally modifying its backing parent list.
 */
public class ConcurrentModificationException {

    public static void main(String[] args) {
        // Initialize the master list
        List<String> masterList = new ArrayList<>(List.of("Apple", "Banana", "Cherry", "Date"));

        // Create a subList view (backed by masterList, not an independent copy)
        List<String> subList = masterList.subList(1, 3); 

        // Structurally modify the parent list, invalidating any active views
        masterList.add("Elderberry");

        // Throws java.util.ConcurrentModificationException
        System.out.println(subList); 
    }
}