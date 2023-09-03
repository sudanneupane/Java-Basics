class GP
{
    int a;
    GP()
    {
        System.out.println("GP class ");
    }
    GP(int x)
    {
        a=x;
    }
}
class P extends GP
{
    int b;
    P()
    {
        super();
        System.out.println("P class ");
    }
    P(int y)
    {
        super (30);
        b=y;
    }
}
class C extends P{

    C()
    {
        super();
        System.out.println("C class ");
    }

    int c;

    C(int z)
    {
        super(20);  // it ( super ) can only be used in first line
                        // Super function is used for calling base class constructor.
        c=z;
    }

    void add()
    {
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("a + b + c = "+(a+b+c));
    }
}

public class Multilevel_InheritanceDemo
{
    public static void main(String[] args)
    {
        C ob= new C();
        C ob1= new C(20);
        ob1.add();
    }
}
