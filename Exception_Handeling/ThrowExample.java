package Exception_Handeling;

public class ThrowExample {
    public static void main(String[] args) {
        
        int age = 15;
        if ( age < 18)
        {
            throw new ArithmeticException( " must be 18+ to vote");
        }
        System.out.println("you can vote");
    }
}
