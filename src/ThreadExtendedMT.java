
class RIT1 extends Thread
{
    RIT1()
    {
        super();
        System.out.println("\nchild thread " +this);
        start();
    }
    public void run()
    {
        try {

            for (int i = 0; i <= 5; i++) {
                System.out.println("In RIT  " +i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println("RIT execution completed");
        }
    }
}

public class ThreadExtendedMT
{
    public static void main(String[] args)
    {
        new RIT1(); // creation of new thread
        try {

            for (int i = 0; i <= 5; i++) {
                System.out.println( "In main  " +i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println("Main execution completed");
        }
    }
}

