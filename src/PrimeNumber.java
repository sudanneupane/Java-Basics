// Program to  find the prime numbers out of given numbers.
import java.util.ArrayList;
class Prime
{
    int n, i, j, count;
    int []arr={1,3,4,19,5,6,7,8,97};
    ArrayList<Integer> pr =new ArrayList<Integer>();

    void set()
    {
        for(j=0;j<arr.length;j++)
        {
            n=arr[j];
            count=0;
            for (i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if(count==2) {
                  pr.add(arr[j]);
            }
            else
            {
                System.out.println("not prime "+arr[j]);
            }
        }
    }
    void  get()
    {
            System.out.println( pr + " are prime");
    }
}

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Prime p =new Prime();
        p.set();
        p.get();

    }
}
