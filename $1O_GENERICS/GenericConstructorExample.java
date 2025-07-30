package $1O_GENERICS;

class Disp
{
    <T> Disp (T data)
    {
        System.out.println(data);
    }
}

public class GenericConstructorExample {
    public static void main(String[] args) {
        Disp d = new Disp ( "Hellow");
        Disp d1 = new Disp(12);
        
    }
}
