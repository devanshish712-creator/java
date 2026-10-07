//	Find the smallest element in each column. 
import java.util.Scanner; // Import Scanner class for taking input.

public class Program019 { // Define the class.

    public static void main(String1[] args) { // Main method starts program execution.

        Scanner sc = new Scanner(System.in); // Create Scanner object.

        System.out.print("Enter number of rows: "); // Ask for rows.
        int r = sc.nextInt(); // Read rows.

        System.out.print("Enter number of columns: "); // Ask for columns.
        int c = sc.nextInt(); // Read columns.

        int[][] a = new int[r][c]; // Create a 2D array.

        for (int i = 0; i < r; i++) { // Loop through rows.

            for (int j = 0; j < c; j++) { // Loop through columns.

                System.out.print("Enter element [" + i + "][" + j + "]: "); // Ask for element.
                a[i][j] = sc.nextInt(); // Store element.

            } // End of inner loop.

        } // End of outer loop.

        for (int j = 0; j < c; j++) { // Loop through each column.

            int smallest = a[0][j]; // Assume first element of column is smallest.

            for (int i = 1; i < r; i++) { // Check remaining elements in column.

                if (a[i][j] < smallest) { // Check if current element is smaller.

                    smallest = a[i][j]; // Update smallest element.

                } // End of if condition.

            } // End of inner loop.

            System.out.println("Smallest in column " + (j + 1) + " = " + smallest); // Display smallest.

        } // End of outer loop.

        sc.close(); // Close Scanner object.

    } // End of main method.

} // End of class.
