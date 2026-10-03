//	Find the sum of the main diagonal. 
import java.util.Scanner; // Import Scanner class for taking input.

public class Program024 { // Define the class.

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

        int sum = 0; // Initialize diagonal sum to zero.

        for (int i = 0; i < n; i++) { // Loop through diagonal positions.

            sum = sum + a[i][i]; // Add main diagonal element.

        } // End of diagonal loop.

        System.out.println("Sum of main diagonal = " + sum); // Display diagonal sum.

        sc.close(); // Close Scanner object.

    } // End of main method.

} // End of class.