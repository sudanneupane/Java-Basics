public class ContinueDemo
{
    public static void main(String args[])
    {
        int i=0, n=10;
        do
        {

            i++;
            if(i%2==0)
                continue;
            System.out.println(i+" is odd number");
        }while(i<n);
    }
}
