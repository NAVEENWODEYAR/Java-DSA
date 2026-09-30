package com.dsa.searching;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Finds the frequency of each character in a given string.
 *
 * <p>
 * Example:
 *
 * Input  : "hello"
 * Output : {h=1, e=1, l=2, o=1}
 *
 * <p>
 * Time Complexity  : O(n)
 * Space Complexity : O(k)
 *
 * where:
 * n = length of the input string
 * k = number of distinct characters
 */
public class CharFrequency {

    /**
     * Finds the frequency of every character in the given string.
     *
     * @param str input string
     * @return map containing each character and its frequency
     * @throws IllegalArgumentException if input is null or empty
     */
    public static Map<Character, Integer> charFrequency(String str) {

        // Guard clause for invalid input.
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException(
                    "Input string must not be null or empty"
            );
        }

        /*
         * LinkedHashMap preserves insertion order.
         * This makes the output easier to read and verify.
         */
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        // Traverse the string once and count every character.
        for (char ch : str.toCharArray()) {

            frequencyMap.put(
                    ch,
                    frequencyMap.getOrDefault(ch, 0) + 1
            );
        }

        return frequencyMap;
    }

    /**
     * Runs multiple test cases using a loop.
     *
     * <p>
     * This is similar to the table-driven approach commonly used
     * in unit testing: input and expected output are stored together,
     * then each test case is executed automatically.
     */
    public static void main(String[] args) {

        /*
         * ---------------------------------------------------------
         * Test Inputs
         * ---------------------------------------------------------
         */
        String[] inputs = {
                "hello",
                "aabbcc",
                "a",
                "AaAa",
                "a b a",
                "a@a#b@",
                "abcd",
                "banana",
                "mississippi"
        };

        /*
         * ---------------------------------------------------------
         * Expected Outputs
         * ---------------------------------------------------------
         */
        Map<Character, Integer>[] expectedResults = new Map[inputs.length];

        // Test Case 1
        expectedResults[0] = mapOf(
                'h', 1,
                'e', 1,
                'l', 2,
                'o', 1
        );

        // Test Case 2
        expectedResults[1] = mapOf(
                'a', 2,
                'b', 2,
                'c', 2
        );

        // Test Case 3
        expectedResults[2] = mapOf(
                'a', 1
        );

        // Test Case 4
        expectedResults[3] = mapOf(
                'A', 2,
                'a', 2
        );

        // Test Case 5
        expectedResults[4] = mapOf(
                'a', 2,
                ' ', 2,
                'b', 1
        );

        // Test Case 6
        expectedResults[5] = mapOf(
                'a', 2,
                '@', 2,
                '#', 1,
                'b', 1
        );

        // Test Case 7
        expectedResults[6] = mapOf(
                'a', 1,
                'b', 1,
                'c', 1,
                'd', 1
        );

        // Test Case 8
        expectedResults[7] = mapOf(
                'b', 1,
                'a', 3,
                'n', 2
        );

        // Test Case 9
        expectedResults[8] = mapOf(
                'm', 1,
                'i', 4,
                's', 4,
                'p', 2
        );

        /*
         * ---------------------------------------------------------
         * Execute all test cases using a loop.
         * ---------------------------------------------------------
         */
        for (int i = 0; i < inputs.length; i++) {

            runTestCase(
                    i + 1,
                    inputs[i],
                    expectedResults[i]
            );
        }

        /*
         * ---------------------------------------------------------
         * Invalid Input Test Cases
         * ---------------------------------------------------------
         */
        String[] invalidInputs = {
                null,
                ""
        };

        for (int i = 0; i < invalidInputs.length; i++) {

            runInvalidTestCase(
                    i + 1,
                    invalidInputs[i]
            );
        }
    }

    /**
     * Executes one valid test case.
     *
     * @param testNumber test case number
     * @param input test input
     * @param expected expected result
     */
    private static void runTestCase(
            int testNumber,
            String input,
            Map<Character, Integer> expected) {

        Map<Character, Integer> actual = charFrequency(input);

        if (expected.equals(actual)) {
            System.out.println(
                    "Test Case " + testNumber + ": PASS"
            );
        } else {
            System.out.println(
                    "Test Case " + testNumber + ": FAIL"
            );

            System.out.println("Input    : " + input);
            System.out.println("Expected : " + expected);
            System.out.println("Actual   : " + actual);
        }
    }

    /**
     * Executes a test case where the input is expected to be invalid.
     *
     * @param testNumber test case number
     * @param input invalid input
     */
    private static void runInvalidTestCase(
            int testNumber,
            String input) {

        try {

            charFrequency(input);

            System.out.println(
                    "Invalid Test Case " + testNumber + ": FAIL"
            );

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "Invalid Test Case " + testNumber + ": PASS"
            );
        }
    }

    /**
     * Utility method to create an ordered frequency map.
     *
     * @param values character-frequency pairs
     * @return frequency map
     */
    private static Map<Character, Integer> mapOf(
            Object... values) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < values.length; i += 2) {

            char character = (Character) values[i];
            int frequency = (Integer) values[i + 1];

            map.put(character, frequency);
        }

        return map;
    }
}

