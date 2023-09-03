public class PrimeNumbers
{
    public static void main(String[] args)
    {
        System.out.println("Prime number are:" );
        int i=0;
        int num=0;
        String PrimeNumbers=" ";
        for (i=1; i<=99; i++)
        {
            int count =0;
            for (num=i; num>=1; num--)
            {
                if (i%num==0)
                {
                    count++;
                    continue;

                }
            }
            if(count==2)
            {
                PrimeNumbers=PrimeNumbers+i+" ";
            }
        }
        System.out.println("Prime number from 1 to 99 are:");
        System.out.println(PrimeNumbers);
    }
}
