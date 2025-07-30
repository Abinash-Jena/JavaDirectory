package $1O_GENERICS;

interface Process <T> 
{
    void process (T imp);
}

class StringProcess implements Process <String>
{
 public void process (String imp)
 {
    System.out.println(imp);
 }
}

public class GenericInterface {
    public static void main(String[] args) {
        StringProcess s = new StringProcess();
        s.process("pick");
    }
}
