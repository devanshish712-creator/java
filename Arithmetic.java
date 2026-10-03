import java.util.Scanner;
class Arithmetic 
{
    public static void main(String args[])
    {
   int a,b;
   System.out.print("Enter two Numbers... ");
   Scanner obj=new Scanner(System.in);
   a=obj.nextInt();
   b=obj.nextInt();
   System.out.print("Addition" +(a+b));
   System.out.print("Subtraction" +(a-b));
   System.out.print("Multiplication" +(a*b));
   System.out.print("Division" +(a/b));
   System.out.print("Remainder" +(a%b));
   
 }
}