//11.	Write a Java program to reverse the elements of an array without using another array. 

import java.util.Scanner; // Import Scanner class.

public class Program11 { // Define the class.
    public static void main(String[] args) { // Main method.
        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of elements: "); // Ask for array size.
        int n = sc.nextInt(); // Read array size.

        int[] a = new int[n]; // Create the array.

        for (int i = 0; i < n; i++) { // Read all elements.
            System.out.print("Enter element " + (i + 1) + ": "); // Ask for element.
            a[i] = sc.nextInt(); // Store the element.
        }

        int left = 0; // Set left pointer to first index.
        int right = n - 1; // Set right pointer to last index.

        while (left < right) { // Continue until pointers meet.
            int temp = a[left]; // Store left element temporarily.
            a[left] = a[right]; // Put right element at left position.
            a[right] = temp; // Put saved element at right position.

            left++; // Move left pointer forward.
            right--; // Move right pointer backward.
        }

        System.out.println("Reversed array:"); // Display heading.

        for (int i = 0; i < n; i++) { // Traverse reversed array.
            System.out.print(a[i] + " "); // Display each element.
        }

        sc.close(); // Close Scanner.
    }
}
