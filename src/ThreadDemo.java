//Each progream comes with atleast one thread

public class ThreadDemo
{
    public static void main(String args[])
    {
        Thread t =Thread.currentThread();
        System.out.println(t);
        t.setName("SN");
        System.out.println("After changing name of thread" +t);
        try{
            for(int i=0;i<=5;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println("Exception handling of sleep");
        }


    }
}
