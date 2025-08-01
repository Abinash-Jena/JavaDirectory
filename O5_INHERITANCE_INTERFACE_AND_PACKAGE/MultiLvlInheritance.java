package O5_INHERITANCE_INTERFACE_AND_PACKAGE;

class Odisha {
    public void dis() {
        System.out.println("this is odisha");
    }
}

class Bbsr extends Odisha {
    public void display() {
        System.out.println("this is bbsr");
    }
}

class Crpf extends Bbsr {
    public void display2() {
        System.out.println("this is crp");
    }
}

public class MultiLvlInheritance {
    public static void main(String[] args) {
        Crpf c = new Crpf();
        c.display2();
        c.display();
        c.dis();
    }
}