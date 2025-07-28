package O9_IO_TYPEWRITERESOURSE;

import java.io.*;

public class ReadingFile {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Hello.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
