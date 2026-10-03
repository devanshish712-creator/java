//12.	Write a Java program to copy all elements of one array into another array. 

import java.util.Scanner; // Import Scanner class.

public class Program12 { // Define the class.
    public static void main(String[] args) { // Main method.
        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of elements: "); // Ask for array size.
        int n = sc.nextInt(); // Read array size.

        int[] a = new int[n]; // Create the first array.
        int[] b = new int[n]; // Create the second array.

        for (int i = 0; i < n; i++) { // Read the first array.
            System.out.print("Enter element " + (i + 1) + ": "); // Ask for element.
            a[i] = sc.nextInt(); // Store element in first array.
        }

        for (int i = 0; i < n; i++) { // Loop through the first array.
            b[i] = a[i]; // Copy element to the second array.
        }

        System.out.println("Copied array:"); // Display heading.

        for (int i = 0; i < n; i++) { // Traverse copied array.
            System.out.print(b[i] + " "); // Display copied element.
        }

        sc.close(); // Close Scanner.
    }
}
