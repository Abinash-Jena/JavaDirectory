interface Printer {
    void printMessage();
}
public class AnonymousMethod2 {
    public static void main(String[] args) {
        Printer printer = () -> System.out.println("Hello, World!");
        printer.printMessage();
    }
}
