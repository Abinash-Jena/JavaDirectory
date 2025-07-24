package Exception_Handeling;

public class NestedTryStatement {
    public static void main(String[] args) {
        try 
        {
            int [] num = {1,2,3};
            System.out.println("outer try");
            try 
            {
                int res = 10/0;
                System.out.println("inner try" + res) ;
            }
            catch ( ArithmeticException e)
            {
                System.out.println("error" + e);
            }
            System.out.println(num [4]);
        }
        catch ( ArrayIndexOutOfBoundsException e)
        {
            System.out.println("arry bound error" + e);
        }
        System.out.println("program continues");
    }
}
