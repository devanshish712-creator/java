//1.	Write a Java program to take n elements from the user and display all the elements of the array

import java.util.Scanner; // Import Scanner class for taking input.

public class Program01 { // Define the class.
    public static void main(String1[] args) { // Main method starts execution.
        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of elements: "); // Ask for array size.
        int n = sc.nextInt(); // Read the size of the array.

        int[] a = new int[n]; // Create an integer array of size n.

        for (int i = 0; i < n; i++) { // Loop through every array index.
            System.out.print("Enter element " + (i + 1) + ": "); // Ask for an element.
            a[i] = sc.nextInt(); // Store the element in the array.
        }

        System.out.println("Array elements are:"); // Display heading.

        for (int i = 0; i < n; i++) { // Loop through the array.
            System.out.print(a[i] + " "); // Display each element.
        }

        sc.close(); // Close Scanner.
    }
}