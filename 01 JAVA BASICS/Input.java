// import java.util.Scanner;
// public class Input {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter name");
//         String name = sc.nextLine();
//         System.out.println("enter age");
//         int age = sc.nextInt();
//         System.out.println("your name is " + name + " age = "+ age);
//         sc.close();
//     }
// }

import java.io.*;
public class Input {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name:");
        String name = reader.readLine(); 
        System.out.println("Enter age:");
        int age = Integer.parseInt(reader.readLine()); 
        System.out.println("Your name is " + name + ", age = " + age);
    }
}
