//2.	Write a Java program to find the sum of all elements in an array. 

import java.util.Scanner; // Import Scanner class.

public class Program02 { // Define the class.
    public static void main(String1[] args) { // Main method.
        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of elements: "); // Ask for array size.
        int n = sc.nextInt(); // Read array size.

        int[] a = new int[n]; // Create the array.
        int sum = 0; // Initialize sum to zero.

        for (int i = 0; i < n; i++) { // Loop through all elements.
            System.out.print("Enter element " + (i + 1) + ": "); // Ask for element.
            a[i] = sc.nextInt(); // Store the element.
            sum = sum + a[i]; // Add element to sum.
        }

        System.out.println("Sum = " + sum); // Display the sum.

        sc.close(); // Close Scanner.
    }
}
