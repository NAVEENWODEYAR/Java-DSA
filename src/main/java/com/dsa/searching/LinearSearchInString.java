package com.dsa.searching;

/**

* Demonstrates how to perform a linear search to check whether
* a given character is present in a String.
*
* <p>The algorithm checks each character of the String one by one
* until the required character is found or the end of the String
* is reached.</p>
*
* <h3>Time Complexity:</h3>
* <ul>
* <li>Best Case: O(1) — character is found at the first position.</li>
* <li>Average Case: O(n) — character may be found somewhere in the middle.</li>
* <li>Worst Case: O(n) — character is at the last position or not present.</li>
* </ul>
*
* <p>Here, {@code n} is the length of the String.</p>
*
* <h3>Space Complexity:</h3>
* <p>O(1) — only a constant amount of extra memory is used,
* regardless of the size of the input String.</p>
  */
  public class LinearSearchInString {

  /**

  * Checks whether a given character is present in the specified String.
  *
  * @param ch the character to search for
  * @param st the String in which the character is searched
  * @return {@code true} if the character is present;
  * ```
        {@code false} otherwise
    ```

  */
  static boolean isCharPresent(char ch, String st) {

   // If the String is empty, the character cannot be present.
   if (st.length() == 0) {
       return false;
   }

   // Traverse the String character by character.
   for (int i = 0; i < st.length(); i++) {

       // Compare the current character with the target character.
       if (st.charAt(i) == ch) {
           return true;
       }
   }

   // The character was not found after checking all characters.
   return false;


  }

  /**

  * Entry point of the program.
  *
  * @param args command-line arguments
    */
    public static void main(String[] args) {

    // Search for the character 'a' in the String "String".
    boolean result = isCharPresent('a', "String");

    // Print the result of the search.
    if (result) {
    System.out.println("Present");
    } else {
    System.out.println("Not present");
    }
    }
    }

/*

* ============================
* Complexity Analysis
* ============================
*
* Let n = length of the input String.
*
* Time Complexity:
*
* Best Case  : O(1)
* The character is found at the first index.
*
* Average Case: O(n)
* The character is found somewhere in the String after
* checking multiple characters.
*
* Worst Case : O(n)
* The character is either at the last index or is not present.
*
* Space Complexity:
*
* O(1)
* Only a few variables such as 'i', 'ch', and 'result'
* are used. No additional data structure is created.
  */
