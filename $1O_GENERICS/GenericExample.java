package $1O_GENERICS;

class Container <T> 
{
    private T data ;
    public void SetData (T data)
    {
        this.data = data;
    }
    public T getData ()
    {
        return data;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        Container <String> cs = new Container <>();
        cs.SetData("dot");
       System.out.println(cs.getData());
       Container <Integer> ci = new Container <> ();
       ci.SetData(42);
       System.out.println(ci.getData());
    }
}
