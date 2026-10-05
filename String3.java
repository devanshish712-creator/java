//search a word in a string program practice (topic 3)
public class String3 {
    public static void main(String[] args) {
        String s = "Hello!"; // Initialize a string variable.
        boolean found = false;
        for(int i = 0; i<s.length(); i++)//loop for string length
        {
           if(s.contains("devanshii")){
            found =  true;
            break;
           }
        }
    System.out.println(found); // Print the string to the console.
    }
}