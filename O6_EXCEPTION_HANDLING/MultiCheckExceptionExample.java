package O6_EXCEPTION_HANDLING;

import java.io.*;

public class MultiCheckExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("ab.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            System.out.println(line);
            br.close();
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (IOException | ArithmeticException e) {
            System.out.println("no file found");
        }
    }

}
