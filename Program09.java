//9.	Write a Java program to find and display all duplicate elements in an array. 

import java.util.Scanner; // Import Scanner class.

public class Program09 { // Define the class.
    public static void main(String[] args) { // Main method.
        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of elements: "); // Ask for array size.
        int n = sc.nextInt(); // Read array size.

        int[] a = new int[n]; // Create the array.

        for (int i = 0; i < n; i++) { // Read all elements.
            System.out.print("Enter element " + (i + 1) + ": "); // Ask for element.
            a[i] = sc.nextInt(); // Store the element.
        }

        System.out.println("Duplicate elements:"); // Display heading.

        for (int i = 0; i < n; i++) { // Select each element.
            boolean alreadyPrinted = false; // Assume it has not been printed.

            for (int k = 0; k < i; k++) { // Check previous elements.
                if (a[k] == a[i]) { // Check if value appeared before.
                    alreadyPrinted = true; // Mark it as already processed.
                    break; // Stop checking previous elements.
                }
            }

            if (alreadyPrinted) { // Check whether duplicate was already printed.
                continue; // Skip to the next element.
            }

            int count = 0; // Initialize occurrence count.

            for (int j = 0; j < n; j++) { // Search the entire array.
                if (a[i] == a[j]) { // Check whether values are equal.
                    count++; // Increase occurrence count.
                }
            }

            if (count > 1) { // Check whether element occurs more than once.
                System.out.print(a[i] + " "); // Display duplicate element.
            }
        }

        sc.close(); // Close Scanner.
    }
}
