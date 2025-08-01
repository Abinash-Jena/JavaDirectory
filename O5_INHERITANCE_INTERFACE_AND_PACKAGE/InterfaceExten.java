package O5_INHERITANCE_INTERFACE_AND_PACKAGE;

interface A{
    void show();
}

interface B extends A{
    void disp(); 
}

class C implements B {
    public void show(){
        System.out.println("Hello Show");
    }
    public void disp(){
        System.out.println("Hello disp");
    }
}
public class InterfaceExten {
    public static void main(String[] args) {
        C c = new C();
        c.disp();
        c.show();
    }
}
