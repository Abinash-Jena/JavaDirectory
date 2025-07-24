 interface MyInterface {
  static void disp ()
  {
    System.out.println("disp printer case");
  }
    
 }

public class StaticInterface implements MyInterface {
    public static void main(String[] args) {
        MyInterface.disp();
    }
}
