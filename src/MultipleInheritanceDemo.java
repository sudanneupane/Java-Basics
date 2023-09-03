/* class P11

{
    P11()
    {
        System.out.println("Parent class");
    }

}
class P22
{
    P22()
    {
        System.out.println("Parent2 class");
    }

}
class MICh extends P11,P22      //possible using concept interface
{
    MICh()
    {
        System.out.println("Child2 class");
    }

}
*/

interface A1
{
    int a=10;
    void k();
}
interface B1
{
    int b=20;
    void add();
}

abstract class C1 implements A1, B1
{
    public void add()
    {
        System.out.println(a+b);
        System.out.println("Illustrating multiple Inheritance");
    }
    public void sub()
    {
        System.out.println(a+b);
        System.out.println("Illustrating that any class that do not implement all the method of interface " +
                "becomes  abstract. and must be declared as abstract class");
    }


}
class D1 extends C1
{
    public void k()
    {
        System.out.println("method of A interface");
    }
}
public class MultipleInheritanceDemo
{

    public static void main (String[] args)
    {
        D1 ob = new D1();
        ob.add();
        ob.sub();
        ob.k();
    }
}

