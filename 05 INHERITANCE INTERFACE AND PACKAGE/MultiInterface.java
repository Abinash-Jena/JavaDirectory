interface A {
    // int x = 10;
    void a();

}

interface B {
    void b();
}

class C implements A, B {
    public void a() {
        System.out.println("a");
    }

    public void b() {
        System.out.println("b");
    }
}

public class MultiInterface {
 public static void main(String[] args) {
    C c = new C();
    c.a();
    c.b();
    // c.x = c.x + 5;;
    // System.out.println(c.x);
 }
}
