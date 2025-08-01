package O1O_GENERICS;

class Square < T extends Number > 
{
    T side;
    public Square (T side)
    {
        this.side = side;
    }
    public double Area ()
    {
        return side.doubleValue()* side.doubleValue();
    }
}

public class BoundTypes {
    public static void main(String[] args) {
        Square <Double> d = new Square <>(3.2);
        System.out.println(d.Area());
        Square <Integer> d1 = new Square<>(15);
        System.out.println(d1.Area());
    }
}
