class A
{
    int a;
    int b;
    /* A()      //dummy constructor . It is created by compiler , not by us.
    {
    }
     */

    A()         //default constructor.
    {
        a=1;
        b=1;
    }

    A(int x,int y) //parametric constructor.
    {
        a=x;
        b=y;
    }
    void disp()
    {
        System.out.println("A="+a+" B="+b);
        System.out.println("Sum"+(a+b));
    }
}

public class ConstructorDemo
{
    public static void main(String [] args)
    {
        A ob1=new A(10,20); //calls parametric constructor automatically.
        A ob2=new A(); //calls default constructor automatically.
        ob1.disp();
        ob2.disp();

    }
}
