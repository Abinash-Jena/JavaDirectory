 class X
 {
    public void display ()
    {
        System.out.println("dot");
    }
 }
 class y extends X 
 {
    public void display ()
    {
        System.out.println("pick");
    }
 }

public class Practice {
    public static void main(String[] args) {
        y p = new y();
        p.display();
    }
}
