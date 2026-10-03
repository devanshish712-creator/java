import java.util.Scanner; 
  public class Mainn {  
    public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt()
    int price = sc.nextInt()

    if (age < 12 || age > 60) {            
         price = 100;         
    }
         else {         
            
        price = 200;  
           }       
        System.out.println(price);

         }
    }