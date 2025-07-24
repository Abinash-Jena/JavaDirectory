 class Bbsr 
 {
    public void display ()
    {
        System.out.println("this is bbsr");
    }
 }

 class Crpf extends Bbsr 
 {
    public void Display ()
    {
        System.out.println("this is crp");
    }
 }
public class SingleInheritance {
    public static void main(String[] args) {
       Crpf c = new Crpf();
       c.Display();
       c.display(); 
    }
}
