//	Find the sum of each column. 

import java.util.Scanner; // Import Scanner class for taking input.

public class Program017 { // Define the class.

    public static void main(String1[] args) { // Main method starts program execution.

        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of rows: "); // Ask for number of rows.
        int r = sc.nextInt(); // Read number of rows.

        System.out.print("Enter number of columns: "); // Ask for number of columns.
        int c = sc.nextInt(); // Read number of columns.

        int[][] a = new int[r][c]; // Create a 2D array.

        for (int i = 0; i < r; i++) { // Loop through rows.

            for (int j = 0; j < c; j++) { // Loop through columns.

                System.out.print("Enter element [" + i + "][" + j + "]: "); // Ask for element.
                a[i][j] = sc.nextInt(); // Store element in array.

            } // End of inner loop.

        } // End of outer loop.

        for (int j = 0; j < c; j++) { // Loop through each column.

            int sum = 0; // Initialize column sum to zero.

            for (int i = 0; i < r; i++) { // Loop through rows of current column.

                sum = sum + a[i][j]; // Add current element to column sum.

            } // End of inner loop.

            System.out.println("Sum of column " + (j + 1) + " = " + sum); // Display column sum.

        } // End of outer loop.

        sc.close(); // Close Scanner object.

    } // End of main method.

} // End of class.