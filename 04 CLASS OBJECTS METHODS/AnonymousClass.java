public class AnonymousClass {
    public static void main(String[] args) {
        abstract class Message {
            abstract void showMessage();
        }
        Message msg = new Message() {
            void showMessage() {
                System.out.println("Hello from an anonymous class!");
            }
        };
        msg.showMessage();
    }
}
