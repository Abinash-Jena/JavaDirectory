package $1O_GENERICS;

class Cac<T, U> {
    private T course;
    private U fees;

    Cac(T course, U fees) {
        this.course = course;
        this.fees = fees;
    }

    public T getcourse() {
        return course;
    }

    public U getfees() {
        return fees;
    }
}

public class DiffTypeGeneric {
    public static void main(String[] args) {
        Cac<String, Integer> csi = new Cac("JAVA ", 5000);
        System.out.println(csi.getcourse());
        System.out.println(csi.getfees());

    }
}
