class A{
    A(){
        System.out.println("Hello from class a");
    }
}
class B extends A{
    B(){
        super();
        System.out.println("Hello from class b");
    }
}
public class SuperOne {
    
    public static void main(String[] args) {
        B b = new B();
    }
}
