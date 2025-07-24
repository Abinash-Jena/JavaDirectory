class A{
    A(){
        System.out.println("Con A");
    }
}
class B extends A{
    B(){
        System.out.println("Con B");
    }
}


public class CustrctorExecution {
    public static void main(String[] args) {
        B b = new B();
    }
}
