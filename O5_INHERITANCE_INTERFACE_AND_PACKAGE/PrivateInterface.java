package O5_INHERITANCE_INTERFACE_AND_PACKAGE;
interface MyInterface {
    default void show() {
        System.out.println(" default method calling priv helper");
        helper();

    }

    private void helper() {
        System.out.println("this is priv method inside interface");
    }
}

public class PrivateInterface implements MyInterface {
    public static void main(String[] args) {
        PrivateInterface pi = new PrivateInterface();
        pi.show();
    }
   } 