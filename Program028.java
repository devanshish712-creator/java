//	Search for an element in a 2D array.

import java.util.Scanner; // Import Scanner class for taking input.

public class Program028 { // Define the class.

    public static void main(String[] args) { // Main method starts program execution.

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

        System.out.print("Enter element to search: "); // Ask for search element.
        int key = sc.nextInt(); // Read search element.

        boolean found = false; // Initially assume element is not found.

        for (int i = 0; i < r; i++) { // Loop through rows.

            for (int j = 0; j < c; j++) { // Loop through columns.

                if (a[i][j] == key) { // Check whether current element matches.

                    System.out.println("Element found at row " + (i + 1)
                            + " and column " + (j + 1)); // Display position.

                    found = true; // Mark element as found.

                } // End of if condition.

            } // End of inner loop.

        } // End of outer loop.

        if (!found) { // Check whether element was not found.

            System.out.println("Element not found."); // Display not-found message.

        } // End of if condition.

        sc.close(); // Close Scanner object.

    } // End of main method.

} // End of class.
