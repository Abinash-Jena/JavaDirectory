class x {
    void disA() {
        System.out.println("hello Parent");
    }
}

class y extends x {
    @Override
    void disA() {
        System.out.println("hello child");
    }
}

public class OverRIding {
    public static void main(String[] args) {
        y x = new y();
        x.disA();
    }
}
