import java.util.*;
// array user se inpuit lekar kaise banayenge
public class Array {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt(); //int size input
    int numbers[] = new int[size];
    
for (int i=0; i<size; i++){ // loop for size input
numbers[i] = sc.nextInt();
}

int x = sc.nextInt(); //traverse in array
    for(int i=0; i<numbers.length; i++) {  //this loop fpr output
        if(numbers[i] == x) {
        System.out.println("x found at index : " + " i");
      
    }
    }
}
}
















    //public static void main(String args[]) {
    // int[] marks = new int[3];
    // int marks[] = {97,98,95};
     //marks[0] = 97; //phy
    // marks[1] = 98; //che
    // marks[2] = 95; //eng
    // for (int i=0;i<3;i++){
   // System.out.println(marks[i]);
    