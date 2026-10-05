//seaarch for a character in a string and count its occurrences

import java.util.Scanner; // Import Scanner class for taking input.

public class String2 {
    public static void main(String[] args) {
        String s = "Hello!"; // Initialize a string variable.
        int count = 1; // Initialize a character variable.
        for (int i = 1; i < s.length(); i++) { // Loop
            if (s.charAt(i) == s.charAt(i - 1)) // Check if character is 'o'.
                count++; // Increment count if character is found.
        }
        System.out.print(count); // Print the string to the console.
    }
}