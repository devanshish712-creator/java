//16	Find the sum of each row. 


import java.util.Scanner; // Import Scanner class for taking input.

public class Program016 { // Define the class.

    public static void main(String1[] args) { // Main method starts program execution.

        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of rows: "); // Ask the user for number of rows.
        int r = sc.nextInt(); // Read number of rows.

        System.out.print("Enter number of columns: "); // Ask the user for number of columns.
        int c = sc.nextInt(); // Read number of columns.

        int[][] a = new int[r][c]; // Create a 2D array.

        for (int i = 0; i < r; i++) { // Loop through each row.

            for (int j = 0; j < c; j++) { // Loop through each column.

                System.out.print("Enter element [" + i + "][" + j + "]: "); // Ask for element.
                a[i][j] = sc.nextInt(); // Store the element in the array.

            } // End of inner loop.

        } // End of outer loop.

        for (int i = 0; i < r; i++) { // Loop through each row.

            int sum = 0; // Initialize sum of current row to zero.

            for (int j = 0; j < c; j++) { // Loop through columns of current row.

                sum = sum + a[i][j]; // Add current element to row sum.

            } // End of inner loop.

            System.out.println("Sum of row " + (i + 1) + " = " + sum); // Display row sum.

        } // End of outer loop.

        sc.close(); // Close Scanner object.

    } // End of main method.

} // End of class.


