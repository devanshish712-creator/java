import java.util.Scanner;

public class TwoDArrays {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int rows = sc.nextInt();
int cols = sc.nextInt();

int[][] numbers = new int[rows][cols];

//input
//rows
for(int i =0; i<rows; i++) {
//columns
for(int j =0; j<rows; j++) {
    numbers[i][j] = sc.nextInt();
}
}

int x = sc.nextInt();  // question se related traverse hoga iss mein

for(int i=0; i<rows; i++) {
for(int j=0; j<cols; j++) {
    //compare with x
    if (numbers[i][j] == x){
   System.out.print("x found at locations (" + i + ", " + j + ")");
}
}
}

}
}

