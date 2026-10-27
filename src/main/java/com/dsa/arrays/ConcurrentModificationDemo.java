package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates how to avoid ConcurrentModificationException by creating an independent copy.
 * 
 * @author NaveenWodeyar
 * @date 24-Oct-2026 12:39:54 am
 */

public class ConcurrentModificationDemo {

    public static void main(String[] args) {
    	
        // Initialize the master list
        List<String> masterList = new ArrayList<>(List.of("Apple", "Banana", "Cherry", "Date"));

        // FIX: Wrap subList in a new ArrayList to break the link and make a copy
        List<String> subList = new ArrayList<>(masterList.subList(1, 3)); 

        // Structurally modify the parent list (safe now because subList is independent)
        masterList.add("Elderberry");
        masterList.remove("remove");
        masterList.add("remove");


        // Works successfully! Output: [Banana, Cherry]
        System.out.println(subList); 
        subList.add(null);
        masterList.addAll(subList);
        
        System.out.println(subList); 
        System.out.println(masterList);
        
    }
}