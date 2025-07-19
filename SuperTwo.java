class A {
    int x = 10;
}

class B extends A {
    int x = 20;

    void dis(){
        System.out.println(super.x);
    }

}

public class SuperTwo {
    public static void main(String[] args) {
        B b = new B();
        b.dis();
    }
}
