package O7_MULTITHREADING;
class Hellow 
{
    int n = 0;
void increment () //   synchronized   void increment () 
    {
        n++;
    }
}

public class UnSynchronizationExample {
    public static void main(String[] args)  {
        Hellow h = new Hellow();
        Thread t1 = new Thread(() -> {
            for (int i = 0 ; i<=1000; i++)
            {
                h.increment();
            }
        } );
        Thread t2 = new Thread(() -> {
            for (int i = 0 ; i<=1000; i++)
            {
                h.increment();
            }
        } );
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println( h.n);
    }
}
