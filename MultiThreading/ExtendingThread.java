package MultiThreading;
class CacMulti extends Thread
{
    public void run ()
    {
        System.out.println("thread is running");
    }
}

public class ExtendingThread {
    public static void main(String[] args) {
        CacMulti c = new CacMulti();
        c.start();
    }
}
