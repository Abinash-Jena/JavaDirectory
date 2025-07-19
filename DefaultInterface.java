interface MyInterface {
    void disp();

    default void show() {
        System.out.println(" default methd inside interface");
    }
}

public class DefaultInterface implements MyInterface {
    public void disp() {
        System.out.println("impletation of disp");
    }

    public static void main(String[] args) {
        DefaultInterface d = new DefaultInterface();
        d.disp();
        d.show();
    }
}
