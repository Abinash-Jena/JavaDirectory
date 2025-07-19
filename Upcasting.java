 class Bbsr{
    public void display()
    {
        System.out.println("Bbsr ");
    }
 }

 class Crpf extends Bbsr
 {
    public void display()
    {
        System.out.println("Crpf");
    }
 }
public class Upcasting {
    public static void main(String[] args) {
       Bbsr b = new Crpf(); 
       b.display();
    }
}
