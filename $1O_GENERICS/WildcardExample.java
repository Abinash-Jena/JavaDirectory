package $1O_GENERICS;

class Printer <T> 
{
    T item;
    Printer (T item)
    {
        this.item = item;
    }
    public void display ()
    {
        System.out.println(item);
    }
}

class Display 
{
    public void Show ( Printer <?> p)
    {
        p.display();
    }
}
public class WildcardExample {
    public static void main(String[] args) {
        Printer <Integer> pi = new Printer <> (15);
        Printer <String> ps = new Printer <> ("DOt");
        Display d = new Display();
        d.Show(pi);
        d.Show(ps);
    }
}
