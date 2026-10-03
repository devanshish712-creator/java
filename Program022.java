//	Multiply two matrices. 
import java.util.Scanner; // Import Scanner class for taking input.

public class Program022 { // Define the class.

    public static void main(String[] args) { // Main method starts program execution.

        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter rows of first matrix: "); // Ask for first matrix rows.
        int r1 = sc.nextInt(); // Read first matrix rows.

        System.out.print("Enter columns of first matrix: "); // Ask for first matrix columns.
        int c1 = sc.nextInt(); // Read first matrix columns.

        System.out.print("Enter rows of second matrix: "); // Ask for second matrix rows.
        int r2 = sc.nextInt(); // Read second matrix rows.

        System.out.print("Enter columns of second matrix: "); // Ask for second matrix columns.
        int c2 = sc.nextInt(); // Read second matrix columns.

        if (c1 != r2) { // Check whether matrix multiplication is possible.

            System.out.println("Matrix multiplication is not possible."); // Display error message.

            sc.close(); // Close Scanner.

            return; // Stop program execution.

        } // End of if condition.

        int[][] a = new int[r1][c1]; // Create first matrix.
        int[][] b = new int[r2][c2]; // Create second matrix.
        int[][] product = new int[r1][c2]; // Create result matrix.

        System.out.println("Enter first matrix:"); // Ask for first matrix.

        for (int i = 0; i < r1; i++) { // Loop through first matrix rows.

            for (int j = 0; j < c1; j++) { // Loop through first matrix columns.

                a[i][j] = sc.nextInt(); // Read first matrix element.

            } // End of inner loop.

        } // End of outer loop.

        System.out.println("Enter second matrix:"); // Ask for second matrix.

        for (int i = 0; i < r2; i++) { // Loop through second matrix rows.

            for (int j = 0; j < c2; j++) { // Loop through second matrix columns.

                b[i][j] = sc.nextInt(); // Read second matrix element.

            } // End of inner loop.

        } // End of outer loop.

        for (int i = 0; i < r1; i++) { // Select each row of first matrix.

            for (int j = 0; j < c2; j++) { // Select each column of second matrix.

                for (int k = 0; k < c1; k++) { // Loop for multiplication and addition.

                    product[i][j] = product[i][j] + a[i][k] * b[k][j]; // Calculate product element.

                } // End of multiplication loop.

            } // End of column loop.

        } // End of row loop.

        System.out.println("Multiplication of matrices:"); // Display heading.

        for (int i = 0; i < r1; i++) { // Loop through result rows.

            for (int j = 0; j < c2; j++) { // Loop through result columns.

                System.out.print(product[i][j] + " "); // Display result element.

            } // End of inner loop.

            System.out.println(); // Move to next row.

        } // End of outer loop.

        sc.close(); // Close Scanner object.

    } // End of main method.

} // End of class.
