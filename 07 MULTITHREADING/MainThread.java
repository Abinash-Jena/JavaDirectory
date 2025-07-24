package MultiThreading;

public class MainThread {
    public static void main(String[] args) {
        System.out.println("this is main thread");
        Thread t = new Thread(() -> {
            System.out.println("this is child thread");
        });

        t.start();
        System.out.println("main thread ends");
    }
}
