package O6_EXCEPTION_HANDLING;

import java.io.*;

public class CheckExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("ab.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            System.out.println(line);
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("no file found");
        } catch (IOException e) {
            System.out.println("File not read.");
        }
    }

}
