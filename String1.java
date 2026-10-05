//string :-- question count space in string

import java.util.Scanner; // Import Scanner class for taking input. 

 class Solution1 {
    public static void main(String[] args) {
        
        String s = "Hello, World!"; // Initialize a string variable.
        int count = 0; // Initialize a counter variable.
        for (int i = 0; i < s.length(); i++) { // Loop
            if(s.charAt(i)==' ')
            count++;
        }
        System.out.print(count); // Print the string to the console.
    }       
}
