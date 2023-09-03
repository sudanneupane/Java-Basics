
class RIT implements Runnable
{
    Thread t;

    RIT()
    {
        t=new Thread(this, "Main Thread");
        System.out.println("\nchild thread " +t);
        t.start();
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

public class RunnableInetrfaceMultiThread
{
    public static void main(String[] args)
    {
        new RIT(); // creation of new thread
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
