 class FinalUsages
{
    final void func()
    {

    }
}
class sub extends FinalUsages
{
    // third use of final
   /* void func() // we cannot override the final method of parent class
    {

    }
*/
}


//Second use of final.
/*
final class FinalUsages
{
}
class sub extends FinalUsages   //Cannot inherit from final 'FinalUsages'
                                // cannot create subclass of final class , error
{

}
*/

public class FinalDemo
{
    final static double PI = 3.14;

    public static void main (String[] args)
    {
        // first use of final
//        PI = 3.1444;    //trying to change the value of constant defined with final keyword gives error
        System.out.println(PI);
    }
}
