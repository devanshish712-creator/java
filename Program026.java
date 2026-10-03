//	Check whether a matrix is an identity matrix. 
import java.util.Scanner; // Import Scanner class for taking input.

public class Program026 { // Define the class.

    public static void main(String[] args) { // Main method starts program execution.

        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter order of square matrix: "); // Ask for matrix size.
        int n = sc.nextInt(); // Read matrix size.

        int[][] a = new int[n][n]; // Create square matrix.

        for (int i = 0; i < n; i++) { // Loop through rows.

            for (int j = 0; j < n; j++) { // Loop through columns.

                a[i][j] = sc.nextInt(); // Read matrix element.

            } // End of inner loop.

        } // End of outer loop.

        boolean identity = true; // Assume matrix is an identity matrix.

        for (int i = 0; i < n; i++) { // Loop through rows.

            for (int j = 0; j < n; j++) { // Loop through columns.

                if (i == j && a[i][j] != 1) { // Check diagonal elements.

                    identity = false; // Matrix is not identity.

                } // End of diagonal condition.

                if (i != j && a[i][j] != 0) { // Check non-diagonal elements.

                    identity = false; // Matrix is not identity.

                } // End of non-diagonal condition.

            } // End of inner loop.

        } // End of outer loop.

        if (identity) { // Check identity result.

            System.out.println("Matrix is an identity matrix."); // Display result.

        } else { // Execute when matrix is not identity.

            System.out.println("Matrix is not an identity matrix."); // Display result.

        } // End of if-else.

        sc.close(); // Close Scanner object.

    } // End of main method.

} // End of class.
