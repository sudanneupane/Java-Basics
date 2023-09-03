
import Calaulator.Calc;
import java.util.*;

public class CalcDemo
{
    public static void main (String[] args)
    {
        Scanner s =new Scanner(System.in);
        Calc c=new Calc();
        System.out.println("Sum= "+c.add(3,4));
        System.out.println("Sub= "+c.sub(14,6));
        System.out.println("Mul= "+c.mul(4,4));
        System.out.println("Div= "+c.div(3,2));

        System.out.println("Enter teo values to add :");
        System.out.println("Add= "+c.add(s.nextInt(),s.nextInt()));
        System.out.println("Enter teo values to sub :");
        System.out.println("Sub= "+c.sub(s.nextInt(),s.nextInt()));
        System.out.println("Enter teo values to mul :");
        System.out.println("Mul= "+c.mul(s.nextInt(),s.nextInt()));
        System.out.println("Enter teo values to div :");
        System.out.println("Div= "+c.div(s.nextDouble(),s.nextDouble()));

    }
}
