//8.	Write a Java program to find how many times a given element occurs in an array
import java.util.Scanner; // Import Scanner class.

public class Program08 { // Define the class.
    public static void main(String[] args) { // Main method.
        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of elements: "); // Ask for array size.
        int n = sc.nextInt(); // Read array size.

        int[] a = new int[n]; // Create the array.

        for (int i = 0; i < n; i++) { // Loop through the array.
            System.out.print("Enter element " + (i + 1) + ": "); // Ask for element.
            a[i] = sc.nextInt(); // Store the element.
        }

        System.out.print("Enter element to count: "); // Ask for target element.
        int key = sc.nextInt(); // Read target element.

        int count = 0; // Initialize occurrence count.

        for (int i = 0; i < n; i++) { // Search the complete array.
            if (a[i] == key) { // Check if current element matches.
                count++; // Increase occurrence count.
            }
        }

        System.out.println("Occurrences = " + count); // Display occurrence count.

        sc.close(); // Close Scanner.
    }
}
