package Exception_Handeling;

public class ExceptionDescriptionExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int res = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }
}
