package O6_EXCEPTION_HANDLING;
class InvalidAge extends Exception 
{
 public InvalidAge ( String msg)
 {
    super (msg);
 }
}

public class CheckedCustom {
    public static void ValidateAge (int age) throws InvalidAge
    {
        if ( age < 18)
        {
            throw new InvalidAge ("ascess denied");
        }
        else 
        {
            System.out.println("ascess granted");
        }
    }
    public static void main(String[] args) {
        try 
        {
            ValidateAge(19);
        }
        catch ( InvalidAge e)
        {
            System.out.println(e);
        }
    }
}
