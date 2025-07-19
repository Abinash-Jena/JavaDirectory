class Outer {
     class Inner {
        void display() {
            System.out.println("hellow world");
        }
    }
}

public class NonStaticClass {
    public static void main(String[] args) {
        Outer out = new Outer ();
        Outer.Inner in = out.new Inner ();
        in.display();
    }
}

