package Exception_Handeling;

public class ThrowsExample {
    public static void divide () throws ArithmeticException 
    {
        System.out.println( 10/0);
    }
    public static void main(String[] args) {
        try 
        {
            divide ();

        }
        catch ( ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
