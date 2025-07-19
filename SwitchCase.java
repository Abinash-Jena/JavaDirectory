import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // type: 1 switch case
        // switch(num){
        //     case 1:
        //         System.out.println("Sun Day");
        //         break;
        //     case 2:
        //         System.out.println("Mon Day");
        //         break;
        //     case 3:
        //         System.out.println("Tues Day");
        //         break;
        //     default:
        //         System.out.println("Invalid Numer");
        // }

        // type: 2 switch case
        // String res = switch(num){
        //     case 1 -> "Sunday";
        //     case 2 -> "Monday";
        //     default -> "no day left";
        // };
        // System.out.println(res);

        // type 3 
         String res = switch(num){
            case 1 : yield "Sunday";
            case 2 : yield "Monday";
            default : yield "no day left";
        };
        System.out.println(res);

    }
}
