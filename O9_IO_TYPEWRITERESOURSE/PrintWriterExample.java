package O9_IO_TYPEWRITERESOURSE;

import java.io.*;

public class PrintWriterExample {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("y.txt")) {
            pw.print("Hello world");
            pw.println(" hello again 1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
