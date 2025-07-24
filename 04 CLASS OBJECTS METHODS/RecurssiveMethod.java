public class RecurssiveMethod {
     int facto (int x)
    {
        if ( x == 1)
        {
            return 1;
        }
        else {
            return x* facto(x-1);
        }
    }
public static void main(String[] args) {
    RecurssiveMethod m = new RecurssiveMethod();
    System.out.println(m.facto(5));
}
}
