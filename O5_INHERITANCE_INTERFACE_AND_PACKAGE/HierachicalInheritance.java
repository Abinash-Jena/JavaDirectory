 package O5_INHERITANCE_INTERFACE_AND_PACKAGE;
 
 class Bbsr 
 {
    public void Display ()
    {
        System.out.println("Bbsr");
    }
 }
 class Crp extends Bbsr
 {
    public void display ()
    {
        System.out.println("crp");
    }
 }
 class Cac extends Bbsr{
 public void display2 ()
 {
    System.out.println("Cac");
 }
 }

public class HierachicalInheritance {
    public static void main(String[] args) {
        Cac c = new Cac();
        c.Display();
        c.display2();
        Crp s = new Crp();
        s.Display();
        s.display();
    }
}
