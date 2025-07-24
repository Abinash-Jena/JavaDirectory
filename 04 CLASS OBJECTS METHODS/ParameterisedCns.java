
public class ParameterisedCns {
    String name;
    int sal;

    ParameterisedCns(String n, int s) {
        name = n;
        sal = s;
    }

    void display() {
        System.out.println(name + " => " + sal);
    }

    public static void main(String[] args) {
        ParameterisedCns pc = new ParameterisedCns("Satya", 20000);
        pc.display();
    }
}
