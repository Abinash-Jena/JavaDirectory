package $1O_GENERICS;

class X 
{
    public <T> void displaytwo (T value )
    {
        System.out.println(value);
        System.out.println(value);
    }
}

public class GenericMethodExample {
    public static void main(String[] args) {
        X  s = new X ( );
        s.<String> displaytwo("JAVA");
        s.displaytwo(15+15);  // AutoType Interface
    }
}
