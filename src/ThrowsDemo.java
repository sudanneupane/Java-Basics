//Program to illustrate the keyword 'throws'
class TsDemo
{
    void throwsFunction() throws Exception
    {
        try
        {
            throw new ArithmeticException();
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Caught in throwsFunction");
        }
       // throw new ArithmeticException(" Thrown inside method.");
    }
}


public class ThrowsDemo
{
    public static void main(String[] args) throws Exception
    {
        TsDemo ts = new TsDemo();
        try{
            ts.throwsFunction();
        }
        catch(Exception e)
        {
            System.out.println("In main");
        }
    }
}
