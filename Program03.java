//3.	Write a Java program to calculate the average of all elements in an array. 

import java.util.Scanner; // Import Scanner class.

public class Program03 { // Define the class.
    public static void main(String1[] args) { // Main method.
        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of elements: "); // Ask for array size.
        int n = sc.nextInt(); // Read array size.

        int[] a = new int[n]; // Create the array.
        int sum = 0; // Initialize sum.

        for (int i = 0; i < n; i++) { // Loop through the array.
            System.out.print("Enter element " + (i + 1) + ": "); // Ask for element.
            a[i] = sc.nextInt(); // Store the element.
            sum = sum + a[i]; // Add element to sum.
        }

        double average = (double) sum / n; // Calculate average.

        System.out.println("Average = " + average); // Display average.

        sc.close(); // Close Scanner.
    }
}
