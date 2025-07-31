package O11_LAMDA_EXPRESSIONS_AND_RECORDS;

record Rectangle(double length, double height) {
    public double area() {
        return length * height;
    }

}

public class RecordExample {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(12.9, 8.2);
        System.out.println(r.area());
    }
}
