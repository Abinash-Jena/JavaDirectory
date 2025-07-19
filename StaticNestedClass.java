class Outer {
    static class Inner {
        void display() {
            System.out.println("hellow world");
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.display();
    }

}