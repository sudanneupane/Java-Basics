//Program to illustrate the use of 'throw'.

class ET
{
    void function()
    {
        try{
            throw new NullPointerException("ET");
        }
        catch(NullPointerException np)
        {
            System.out.println("Caught in 'function'. " + np);
            throw np;
        }
    }
}




public class ExplicitThrow
{
    public static void main(String[] args)
    {
        ET ob = new ET();
        try{
            ob.function();

        }
        catch(NullPointerException mnp)
        {
            System.out.println("Caught in 'main' again");
        }
    }
}
