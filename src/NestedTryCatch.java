class NTC
{
    int a, b;
    int a1[]={1};
    NTC()
    {
        a=10;
        b=0;
    }
    void dbz()
    {
        int c=a/b;
    }
    void aiobe()
    {
        a1[43]= 100;

    }
}


public class NestedTryCatch
{
    public static void main(String[] args)
    {
        NTC ob= new NTC();
        try
        {
//            ob.dbz();     // this will directly go to catch (if there is exception) and won't run our inner try-catch
            try
            {
                ob.aiobe();
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e.getMessage()+" Exception in Nested try-catch");
            }
            ob.dbz();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage()+" Exception in outer try-catch");
        }
    }
}
