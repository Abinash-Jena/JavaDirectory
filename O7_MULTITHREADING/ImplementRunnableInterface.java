package O7_MULTITHREADING;

class CacRunnable implements Runnable {
    public void run() {
        System.out.println("runnable is running");
    }
}

public class ImplementRunnableInterface {
    public static void main(String[] args) {
        Thread t = new Thread(new CacRunnable());
        t.start();

    }
}
