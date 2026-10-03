//4.	Write a Java program to find the largest and smallest element in an array. 

import java.util.Scanner; // Import Scanner class.

public class Program04 { // Define the class.
    public static void main(String[] args) { // Main method.
        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of elements: "); // Ask for array size.
        int n = sc.nextInt(); // Read array size.

        int[] a = new int[n]; // Create the array.

        for (int i = 0; i < n; i++) { // Loop through all elements.
            System.out.print("Enter element " + (i + 1) + ": "); // Ask for element.
            a[i] = sc.nextInt(); // Store the element.
        }

        int largest = a[0]; // Assume first element is largest.
        int smallest = a[0]; // Assume first element is smallest.

        for (int i = 1; i < n; i++) { // Check remaining elements.
            if (a[i] > largest) { // Check for a larger element.
                largest = a[i]; // Update largest.
            }

            if (a[i] < smallest) { // Check for a smaller element.
                smallest = a[i]; // Update smallest.
            }
        }

        System.out.println("Largest = " + largest); // Display largest.
        System.out.println("Smallest = " + smallest); // Display smallest.

        sc.close(); // Close Scanner.
    }
}
