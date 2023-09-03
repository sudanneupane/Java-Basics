
class MC
{
    int a,b;
    int[] a1 ={1};
    MC()
    {
        a=10;
        b=0;
    }
    void dbz()      //Divide by zero exception
    {
        int c=a/b;
        System.out.println(c);
    }
    void aiobe()    // ArrayIndexOutOfBondsException
    {
        a1[46]=100;
        System.out.println(a1[46]);
    }

}

public class MultipleCatch
{
    public static void main (String[] args)
    {
        try {
            MC ob = new MC();
            ob.dbz();
            ob.aiobe();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Attempt to divide by zero!!  Please correct it");
        }
        catch(Exception e)
        {
            System.out.println("Attempt to access the array element beyond it's length ");
        }
        System.out.println("Further code");
    }
}
// Important
/* whenever we have multiple catch, we must write subclass exception before we write super class exception
* */
