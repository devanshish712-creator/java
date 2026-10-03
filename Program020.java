//.	Add two matrices. 

import java.util.Scanner; // Import Scanner class for taking input.

public class Program020 { // Define the class.

    public static void main(String[] args) { // Main method starts program execution.

        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of rows: "); // Ask for rows.
        int r = sc.nextInt(); // Read rows.

        System.out.print("Enter number of columns: "); // Ask for columns.
        int c = sc.nextInt(); // Read columns.

        int[][] a = new int[r][c]; // Create first matrix.
        int[][] b = new int[r][c]; // Create second matrix.
        int[][] sum = new int[r][c]; // Create result matrix.

        System.out.println("Enter elements of first matrix:"); // Ask for first matrix.

        for (int i = 0; i < r; i++) { // Loop through rows.

            for (int j = 0; j < c; j++) { // Loop through columns.

                a[i][j] = sc.nextInt(); // Read first matrix element.

            } // End of inner loop.

        } // End of outer loop.

        System.out.println("Enter elements of second matrix:"); // Ask for second matrix.

        for (int i = 0; i < r; i++) { // Loop through rows.

            for (int j = 0; j < c; j++) { // Loop through columns.

                b[i][j] = sc.nextInt(); // Read second matrix element.

            } // End of inner loop.

        } // End of outer loop.

        for (int i = 0; i < r; i++) { // Loop through rows.

            for (int j = 0; j < c; j++) { // Loop through columns.

                sum[i][j] = a[i][j] + b[i][j]; // Add corresponding elements.

            } // End of inner loop.

        } // End of outer loop.

        System.out.println("Addition of matrices:"); // Display heading.

        for (int i = 0; i < r; i++) { // Loop through result rows.

            for (int j = 0; j < c; j++) { // Loop through result columns.

                System.out.print(sum[i][j] + " "); // Display result element.

            } // End of inner loop.

            System.out.println(); // Move to next row.

        } // End of outer loop.

        sc.close(); // Close Scanner object.

    } // End of main method.

} // End of class.
