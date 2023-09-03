//more then one method with same name and same arguments , one is written in parent class and the other is written in child class

class Method
{
    int a;
    void set(int x)
    {
        a=x;
        System.out.println("In base class");
    }
}

class SubMethod extends Method{
    int b;
    void set(int x)
    {
        b=x;
        System.out.println("In child class");
    }
    void display()
    {
        super.set(5);
        System.out.println(super.a+b);
    }
}


public class MethodOverriding
{
    public static void main(String[] args)
    {
        //       Method m=new Method();
//        m.set(5);
        SubMethod sm = new SubMethod();
        sm.set(10);
        sm.display();
    }
}
