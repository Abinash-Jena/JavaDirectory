package Exception_Handeling;

public class ExceptionExample {
    public static void main(String[] args) {
        // int n = 10;
        // int res = n / 0;
        // System.out.println("Result: " + res);
        try {
        int n = 10;
        int res = n/0;
        System.out.println("Result: "+res);
        }
        catch (ArithmeticException e) {
        System.out.println("num cannot be divided by zero");
        }
        finally {
        System.out.println("program done");
        }
    }
}
