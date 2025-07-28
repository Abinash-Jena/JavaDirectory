package O9_IO_TYPEWRITERESOURSE;
import java.io.*;
public class TryWithResourse {
    public static void main(String[] args) {
        try  
        {
            BufferedWriter bw  = new BufferedWriter(new FileWriter("x.txt"));
            bw.write("hellow world  ");
        }
        catch (IOException e )
        {
            e.printStackTrace();
        }
    }
}
