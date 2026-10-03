//	Find the sum of each column. 

import java.util.Scanner; // Import Scanner class for taking input.

public class Program018 { // Define the class.

    public static void main(String[] args) { // Main method starts program execution.

        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of rows: "); // Ask for number of rows.
        int r = sc.nextInt(); // Read number of rows.

        System.out.print("Enter number of columns: "); // Ask for number of columns.
        int c = sc.nextInt(); // Read number of columns.

        int[][] a = new int[r][c]; // Create a 2D array.

        for (int i = 0; i < r; i++) { // Loop through rows.

            for (int j = 0; j < c; j++) { // Loop through columns.

                System.out.print("Enter element [" + i + "][" + j + "]: "); // Ask for element.
                a[i][j] = sc.nextInt(); // Store element.

            } // End of inner loop.

        } // End of outer loop.

        for (int i = 0; i < r; i++) { // Loop through each row.

            int largest = a[i][0]; // Assume first element of row is largest.

            for (int j = 1; j < c; j++) { // Check remaining elements.

                if (a[i][j] > largest) { // Check if current element is larger.

                    largest = a[i][j]; // Update largest element.

                } // End of if condition.

            } // End of inner loop.

            System.out.println("Largest in row " + (i + 1) + " = " + largest); // Display largest.

        } // End of outer loop.

        sc.close(); // Close Scanner object.

    } // End of main method.

} // End of class.