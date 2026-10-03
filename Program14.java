//14.	Write a Java program to find the second-smallest element in an array. 

import java.util.Scanner; // Import Scanner class.

public class Program14 { // Define the class.
    public static void main(String[] args) { // Main method.
        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of elements: "); // Ask for array size.
        int n = sc.nextInt(); // Read array size.

        int[] a = new int[n]; // Create the array.

        for (int i = 0; i < n; i++) { // Read all elements.
            System.out.print("Enter element " + (i + 1) + ": "); // Ask for element.
            a[i] = sc.nextInt(); // Store the element.
        }

        int smallest = Integer.MAX_VALUE; // Set initial smallest value.
        int second = Integer.MAX_VALUE; // Set initial second-smallest value.

        for (int i = 0; i < n; i++) { // Traverse the array.
            if (a[i] < smallest) { // Check if current element is smallest.
                second = smallest; // Move old smallest to second place.
                smallest = a[i]; // Update smallest.
            } else if (a[i] < second && a[i] != smallest) { // Check for second-smallest.
                second = a[i]; // Update second-smallest.
            }
        }

        if (second == Integer.MAX_VALUE) { // Check if second-smallest does not exist.
            System.out.println("Second-smallest element does not exist."); // Display message.
        } else { // Execute when second-smallest exists.
            System.out.println("Second-smallest = " + second); // Display second-smallest.
        }

        sc.close(); // Close Scanner.
    }
}
