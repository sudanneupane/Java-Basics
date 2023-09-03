//this program demonstrates the handling  of the exception
class Add1
{
    int a,b;
    Add1()
    {
        a=10;
        b=0;
    }
    void fun()
    {
        try
        {
            System.out.println("Executed before exception.");
            int c=a/b;  //attempt to divide by 0
            System.out.println("Executed after exception.");
        }
        catch(Exception e)
        {
            System.out.println("Attempt to '"+e.getMessage()+ "'. \nPlease change the logic");
        }
    }
    void display()
    {
        System.out.println("Another function.");
    }
}

public class WithExceptionHandling
{
    public static void main(String[] args)
//       Method to use try - catch in main function and not in the exception function
//    {
//        try{
//            Add1 ob=new Add1();
//            ob.fun();       //there is exception
//            ob.display();
//        }
//          catch(Exception e)
//        {
//            System.out.println("Attempt to '"+e.getMessage()+ "'. \nPlease change the logic");
//        }
//    }
//       Method to use try - catch in the function with exception
    {
        Add1 ob=new Add1();
        ob.fun();       //there is exception
        ob.display();

    }
}
