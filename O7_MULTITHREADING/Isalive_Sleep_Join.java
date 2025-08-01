package O7_MULTITHREADING;
class CacAllMethod extends Thread {
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println(getName() + " is running: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
            }
        }
        System.out.println(getName() + " has finished execution.");
    }
}
public class Isalive_Sleep_Join {
    public static void main(String[] args) {
        CacAllMethod t1 = new CacAllMethod();
        CacAllMethod t2 = new CacAllMethod();
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t1.start();
        t2.start();
        System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Is " + t1.getName() + " alive after join? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive after join? " + t2.isAlive());
        System.out.println("Main thread finished.");
    }
}
