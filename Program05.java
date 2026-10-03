//5.	Write a Java program to count the number of even and odd elements in an array. 

import java.util.Scanner; // Import Scanner class.

public class Program05 { // Define the class.
    public static void main(String[] args) { // Main method.
        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of elements: "); // Ask for array size.
        int n = sc.nextInt(); // Read array size.

        int[] a = new int[n]; // Create the array.
        int even = 0; // Initialize even count.
        int odd = 0; // Initialize odd count.

        for (int i = 0; i < n; i++) { // Loop through all elements.
            System.out.print("Enter element " + (i + 1) + ": "); // Ask for element.
            a[i] = sc.nextInt(); // Store the element.

            if (a[i] % 2 == 0) { // Check if element is even.
                even++; // Increase even count.
            } else { // Otherwise the element is odd.
                odd++; // Increase odd count.
            }
        }

        System.out.println("Even elements = " + even); // Display even count.
        System.out.println("Odd elements = " + odd); // Display odd count.

        sc.close(); // Close Scanner.
    }
}