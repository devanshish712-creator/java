//13.	Write a Java program to find the second-largest element in an array. 

import java.util.Scanner; // Import Scanner class.

public class Program13 { // Define the class.
    public static void main(String[] args) { // Main method.
        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of elements: "); // Ask for array size.
        int n = sc.nextInt(); // Read array size.

        int[] a = new int[n]; // Create the array.

        for (int i = 0; i < n; i++) { // Read all elements.
            System.out.print("Enter element " + (i + 1) + ": "); // Ask for element.
            a[i] = sc.nextInt(); // Store the element.
        }

        int largest = Integer.MIN_VALUE; // Set initial largest value.
        int second = Integer.MIN_VALUE; // Set initial second-largest value.

        for (int i = 0; i < n; i++) { // Traverse the array.
            if (a[i] > largest) { // Check if current element is largest.
                second = largest; // Move old largest to second place.
                largest = a[i]; // Update largest.
            } else if (a[i] > second && a[i] != largest) { // Check for second-largest.
                second = a[i]; // Update second-largest.
            }
        }

        if (second == Integer.MIN_VALUE) { // Check if second-largest does not exist.
            System.out.println("Second-largest element does not exist."); // Display message.
        } else { // Execute when second-largest exists.
            System.out.println("Second-largest = " + second); // Display second-largest.
        }

        sc.close(); // Close Scanner.
    }
}