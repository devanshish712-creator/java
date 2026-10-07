//	Check whether a matrix is symmetric. 
import java.util.Scanner; // Import Scanner class for taking input.

public class Program027 { // Define the class.

    public static void main(String1[] args) { // Main method starts program execution.

        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter order of square matrix: "); // Ask for matrix size.
        int n = sc.nextInt(); // Read matrix size.

        int[][] a = new int[n][n]; // Create square matrix.

        for (int i = 0; i < n; i++) { // Loop through rows.

            for (int j = 0; j < n; j++) { // Loop through columns.

                a[i][j] = sc.nextInt(); // Read matrix element.

            } // End of inner loop.

        } // End of outer loop.

        boolean symmetric = true; // Assume matrix is symmetric.

        for (int i = 0; i < n; i++) { // Loop through rows.

            for (int j = 0; j < n; j++) { // Loop through columns.

                if (a[i][j] != a[j][i]) { // Compare element with its transpose position.

                    symmetric = false; // Matrix is not symmetric.

                } // End of if condition.

            } // End of inner loop.

        } // End of outer loop.

        if (symmetric) { // Check symmetry result.

            System.out.println("Matrix is symmetric."); // Display result.

        } else { // Execute when matrix is not symmetric.

            System.out.println("Matrix is not symmetric."); // Display result.

        } // End of if-else.

        sc.close(); // Close Scanner object.

    } // End of main method.

} // End of class.
