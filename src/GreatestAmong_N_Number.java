//Program to find the greatest numbers among given numbers.
public class GreatestAmong_N_Number
{
    public static void main(String[] args)
    {
        int temp1;
        int[] a ={2,7,7,43,5,50,50,0,7};
        int  tempGreat=a[0];
        for(int i=1;i<a.length;i++)
        {
            temp1=a[i];
            if (temp1 > tempGreat)
            {
                tempGreat = temp1;
            }
        }
        System.out.println("The greatest number is " + tempGreat);
    }
}
