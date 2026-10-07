// ye aapna college vala hai code one shot vala

class Student {
String1 name;
int age;


public void printName() {              //function haai anme ko print karane ke liye
     System.out.println(this.name);
     System.out.println(this.age);
   }
   //student  class ke liye constructor banana hai
   Student(Student s2) {
    this.name = s2.name;
    this.age =  s2.age;
   }
   Student() {

   }
}

public class OOPSS {

     public static void main(String1 args[]) {
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;


        Student s2 = new Student(s1);
        
        s2.printName();
     }
}