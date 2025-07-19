import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter percentage");
        int p = sc.nextInt();
        if (p >= 90)
            System.out.println("Cash prize: 5000");
        if (p >= 95) {
            System.out.println("Cash prize: 8000");
        }
    }
}
