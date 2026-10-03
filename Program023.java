//	Find the transpose of a matrix. 
import java.util.Scanner; // Import Scanner class for taking input.

public class Program023 { // Define the class.

    public static void main(String[] args) { // Main method starts program execution.

        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of rows: "); // Ask for rows.
        int r = sc.nextInt(); // Read rows.

        System.out.print("Enter number of columns: "); // Ask for columns.
        int c = sc.nextInt(); // Read columns.

        int[][] a = new int[r][c]; // Create original matrix.
        int[][] transpose = new int[c][r]; // Create transpose matrix.

        for (int i = 0; i < r; i++) { // Loop through rows.

            for (int j = 0; j < c; j++) { // Loop through columns.

                a[i][j] = sc.nextInt(); // Read matrix element.

            } // End of inner loop.

        } // End of outer loop.

        for (int i = 0; i < r; i++) { // Loop through original rows.

            for (int j = 0; j < c; j++) { // Loop through original columns.

                transpose[j][i] = a[i][j]; // Store element at transposed position.

            } // End of inner loop.

        } // End of outer loop.

        System.out.println("Transpose of matrix:"); // Display heading.

        for (int i = 0; i < c; i++) { // Loop through transpose rows.

            for (int j = 0; j < r; j++) { // Loop through transpose columns.

                System.out.print(transpose[i][j] + " "); // Display transpose element.

            } // End of inner loop.

            System.out.println(); // Move to next row.

        } // End of outer loop.

        sc.close(); // Close Scanner object.

    } // End of main method.

} // End of class.