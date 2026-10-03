class StringExample
{
   public static void main(String[] args) {
   
    String a="ankit"; //literal
    System.out.println(a);

    String b="ankit"; //literal
    System.out.println(b);

    a= a.concat("kumar"); //a= karke 
    System.out.println(a);
   }
}
  //using new keyword
  class StringExample
{
   public static void main(String[] args) {
   
    String a=new String("ankit"); //ankit object ko a refer kar raha haai
    System.out.println(a); //output ankit aayega
    
    String b=new String("ankit");
    System.out.println(b);

    a= a.concat("kumar"); //iss mein a ki value ankit hi rahegi
    System.out.println(a);
    
}