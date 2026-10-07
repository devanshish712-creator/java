import java.util.Scanner; // Imports Scanner class to take input

class DigitChecker {

    public static void main(String1[] args) {

        // Creates Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Reads one integer from user
        // Example input: 12321
        int n = sc.nextInt();

        // Stores original number because n will change inside while loop
        // original = 12321
        int original = n;

        // Stores sum of all digits; starts from 0
        int sum = 0;

        // Stores reversed number; starts from 0
        int reverse = 0;

        // Loop runs while number is greater than 0
        while (n > 0) {

            // Gets last digit using modulus operator %
            // Example: 12321 % 10 = 1
            int digit = n % 10;

            // Adds current digit to sum
            // Example: sum = 0 + 1 = 1
            sum = sum + digit;

            // Builds the reverse number
            // Example: reverse = 0 * 10 + 1 = 1
            // Next time: reverse = 1 * 10 + 2 = 12
            reverse = reverse * 10 + digit;

            // Removes last digit from n
            // Example: 12321 / 10 = 1232
            n = n / 10;
        }

        // Prints total sum of digits
        // For 12321, sum is 1 + 2 + 3 + 2 + 1 = 9
        System.out.println("Digit Sum: " + sum);

        // Checks whether original number and reversed number are same
        // If same, it is a palindrome
        if (original == reverse) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
    }
}