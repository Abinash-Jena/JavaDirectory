package O7_MULTITHREADING;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    public void run() {
        try {
            System.out.println(getName() + " is running with priority: " + getPriority());
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " - Step " + i);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
    }
}

public class PriorityThreads {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY); 
        t1.start();
        t2.start();
        t3.start();
    }
}