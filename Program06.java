//6.	Write a Java program to count positive numbers, negative numbers, and zeros in an array

import java.util.Scanner; // Import Scanner class.

public class Program06 { // Define the class.
    public static void main(String[] args) { // Main method.
        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of elements: "); // Ask for array size.
        int n = sc.nextInt(); // Read array size.

        int[] a = new int[n]; // Create the array.

        int positive = 0; // Initialize positive count.
        int negative = 0; // Initialize negative count.
        int zero = 0; // Initialize zero count.

        for (int i = 0; i < n; i++) { // Loop through all elements.
            System.out.print("Enter element " + (i + 1) + ": "); // Ask for element.
            a[i] = sc.nextInt(); // Store the element.

            if (a[i] > 0) { // Check if element is positive.
                positive++; // Increase positive count.
            } else if (a[i] < 0) { // Check if element is negative.
                negative++; // Increase negative count.
            } else { // Otherwise element is zero.
                zero++; // Increase zero count.
            }
        }

        System.out.println("Positive = " + positive); // Display positive count.
        System.out.println("Negative = " + negative); // Display negative count.
        System.out.println("Zero = " + zero); // Display zero count.

        sc.close(); // Close Scanner.
    }
}