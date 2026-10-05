//calculate the length of a string without using length() method
class String4 {
    public static void main(String[] args) {
        String s = "Devanshi Sharma"; // Initialize a string variable.
        int count = 0; // Initialize a counter variable.
        for (int i=0;i<s.length();i++) { // Loop through each character in the string.
            count++; // Increment the counter for each character.
        }
        System.out.print(count); // Print the length of the string to the console.
    }
}