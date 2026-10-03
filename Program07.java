//s7.	Write a Java program to search for a given element in an array and display its position

import java.util.Scanner; // Import Scanner class.

public class Program07 { // Define the class.
    public static void main(String[] args) { // Main method.
        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of elements: "); // Ask for array size.
        int n = sc.nextInt(); // Read array size.

        int[] a = new int[n]; // Create the array.

        for (int i = 0; i < n; i++) { // Loop through the array.
            System.out.print("Enter element " + (i + 1) + ": "); // Ask for element.
            a[i] = sc.nextInt(); // Store the element.
        }

        System.out.print("Enter element to search: "); // Ask for search value.
        int key = sc.nextInt(); // Read search value.

        boolean found = false; // Initially assume element is not found.

        for (int i = 0; i < n; i++) { // Search through the array.
            if (a[i] == key) { // Check whether current element matches.
                System.out.println("Element found at position " + (i + 1)); // Display position.
                found = true; // Mark element as found.
                break; // Stop searching after first occurrence.
            }
        }

        if (!found) { // Check if element was not found.
            System.out.println("Element not found."); // Display not-found message.
        }

        sc.close(); // Close Scanner.
    }
}
