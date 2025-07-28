package O9_IO_TYPEWRITERESOURSE;

import java.io.*;


public class WritingFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Hello.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("this is new txt frm me ");
            bw.newLine();
            bw.write("this is new txt line");
            bw.close();
            fw.close();
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
}
}
