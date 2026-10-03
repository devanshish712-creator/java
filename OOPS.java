class Pen  // iss pen class mein pen ka blueprint banega
{
String color;// properties of pen
String type; // ballpoint; gel

//function perform jaise pen ka kaam likhna
public void write() {
   System.out.println("writing something");
  }

//if we want to print color and type also
public void printColor() {
     System.out.println(this.color); //this keyword in java ;this batayegaa iss funct ko kisne call kiya
     /* 
this.color = color;
this = current object.
this.color = object ka variable.
color = received value.
}
*/
    } 
   }    



//public class oops iss mein hum aapna main function likhenge
    public class OOPS 
    {
    public static void main(String args[]){ //java mein ye string of arg leta hai

     //class name object name = new pen(); new? 
    Pen pen1 = new Pen(); //main function ka pehla  object
    //define pen color and type
    pen1.color = "blue"; //property ko access dot laga kar karte hai
    pen1.type = "gel";
    
    Pen pen2 = new Pen();
    pen2.color = "black";
    pen2.type = "ball";
    
    pen1.printColor();
    pen2.printColor();
    }
}

//every object has its own properties and methods propertiees jaise ki color,type,
//  methods:-- ye class ke data or members hai ; data means string int type ka data or members means uske function



/* important points
class ke nme capotal se shuru
function ke name smaall letter se

; or } ka dhyan rakhiyo





*/