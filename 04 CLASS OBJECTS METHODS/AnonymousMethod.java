public class AnonymousMethod {
    public static void main(String[] args) {
        new Object() {
            void printMessage() {
                System.out.println("Hello, World!");
            }
        }.printMessage(); 
    }
}
