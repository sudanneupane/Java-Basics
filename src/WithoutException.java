//this program demonstrates the limitation of not handling the exception
class Add
{
    int a,b;
    Add()
    {
        a=10;
        b=0;
    }
    void fun()
    {
        System.out.println("Executed before exception");
        int c=a/b;  //attempt to divide by 0
        System.out.println("Executed after exception");
    }
    void display()
    {
        System.out.println("Another function");
    }
}

public class WithoutException
{
    public static void main(String[] args)
    {
        Add ob=new Add();
        ob.fun();
        ob.display();
    }

}
