/*
public class FunInMainClass
{
    static void callFun(int t[])
    {
        System.out.println("The element s are");
        for (int i:t)
        {
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        int a[]={11,12,23,2,54};
        callFun(a);     //Function call
    }
}*/

public class FunInMainClass
{
    static int add(int x, int y)
    {
        return (x+y);
    }
    public static void main(String args[])
    {
        int a=11, b=34;
        int c= add(a,b);    //Function call
        System.out.println("Output is: " +c);
    }
}
