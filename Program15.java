//15.	Write a Java program to calculate the sum of elements present at even indexes and odd indexes separately.

import java.util.Scanner; // Import Scanner class.

public class Program15 { // Define the class.
    public static void main(String[] args) { // Main method.
        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of elements: "); // Ask for array size.
        int n = sc.nextInt(); // Read array size.

        int[] a = new int[n]; // Create the array.

        for (int i = 0; i < n; i++) { // Read all elements.
            System.out.print("Enter element " + (i + 1) + ": "); // Ask for element.
            a[i] = sc.nextInt(); // Store the element.
        }

        int evenIndexSum = 0; // Initialize sum for even indexes.
        int oddIndexSum = 0; // Initialize sum for odd indexes.

        for (int i = 0; i < n; i++) { // Traverse all array indexes.
            if (i % 2 == 0) { // Check whether index is even.
                evenIndexSum += a[i]; // Add element to even-index sum.
            } else { // Execute when index is odd.
                oddIndexSum += a[i]; // Add element to odd-index sum.
            }
        }

        System.out.println("Sum at even indexes = " + evenIndexSum); // Display even-index sum.
        System.out.println("Sum at odd indexes = " + oddIndexSum); // Display odd-index sum.

        sc.close(); // Close Scanner.
    }
}