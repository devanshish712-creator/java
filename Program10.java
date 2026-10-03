//10.	Write a Java program to display all elements that occur only once in an array. 

import java.util.Scanner; // Import Scanner class.

public class Program10 { // Define the class.
    public static void main(String[] args) { // Main method.
        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of elements: "); // Ask for array size.
        int n = sc.nextInt(); // Read array size.

        int[] a = new int[n]; // Create the array.

        for (int i = 0; i < n; i++) { // Read all elements.
            System.out.print("Enter element " + (i + 1) + ": "); // Ask for element.
            a[i] = sc.nextInt(); // Store the element.
        }

        System.out.println("Elements occurring only once:"); // Display heading.

        for (int i = 0; i < n; i++) { // Select each element.
            int count = 0; // Initialize occurrence count.

            for (int j = 0; j < n; j++) { // Compare with every element.
                if (a[i] == a[j]) { // Check whether values are equal.
                    count++; // Increase occurrence count.
                }
            }

            if (count == 1) { // Check if element occurs exactly once.
                System.out.print(a[i] + " "); // Display the unique element.
            }
        }

        sc.close(); // Close Scanner.
    }
}