public class AllPrimeNumber
{
    public static void main(String[] args)
    {
        int i=0, num, count;
        System.out.println("Prime numbers are:");
        for(i=1; i<100; i++)
        {
            count=0;
            for(int j=1; j<=i;j++)
            {
                if (j%i==0)
                {
                    count++;
                }
            }
            if(count==2) {
                System.out.print(i + " ");
            }
        }
    }
}
// gives prime number.