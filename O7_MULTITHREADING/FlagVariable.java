package O7_MULTITHREADING;
class Cac extends Thread {
    private boolean suspended = false;
    private boolean stopped = false;
    public synchronized void pauseThread() {
        suspended = true;
    }
    public synchronized void resumeThread() {
        suspended = false;
        notify(); 
    }
    public synchronized void stopThread() {
        stopped = true;
        suspended = false;
        notify();
    }
    public void run() {
        int i = 1;
        while (true) {
            synchronized (this) {
                while (suspended) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted while suspended.");
                    }
                }
                if (stopped) {
                    break;
                }
            }
            System.out.println("Count: " + i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted during sleep.");
            }
        }
        System.out.println("Thread stopped.");
    }
}
public class FlagVariable {
    public static void main(String[] args) {
        Cac thread = new Cac();
        thread.start();
        try {
            Thread.sleep(2000);
            thread.pauseThread();
            System.out.println("Thread paused...");
            Thread.sleep(2000);
            thread.resumeThread();
            System.out.println("Thread resumed...");
            Thread.sleep(2000);
            thread.stopThread();
            System.out.println("Thread stopped...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}