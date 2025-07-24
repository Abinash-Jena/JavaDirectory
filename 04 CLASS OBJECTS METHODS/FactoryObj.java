class normal {
    void display() {
        System.out.println("hellow");
    }
}
public class FactoryObj {
    public static normal ndisplay() {
        return new normal();
    }
    public static void main(String[] args) {
        normal m = FactoryObj.ndisplay();
        m.display();
    }
}
