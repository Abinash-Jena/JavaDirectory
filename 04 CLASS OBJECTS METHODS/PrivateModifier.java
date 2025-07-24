class x 
{
     int p = 5;
    
}
class y extends x{

}

public class PrivateModifier {
    public static void main(String[] args) {
        y s =  new y ();
        System.out.println(s.p);
    }
}
