import java.util.Scanner;
 class Attendance {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totaldays = sc.nextInt(); //sc.nextInt();
    int dayspresent = sc.nextInt();
    double attendance = (double) dayspresent/totaldays*100;

    System.out.println("Attendance: " + attendance + "%");  //"Attendance: " + attendance + "%"
    if (attendance >= 75)
        System.out.println("eligible");   

    else
        System.out.println("not eligible");
}
}