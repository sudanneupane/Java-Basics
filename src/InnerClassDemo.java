//Program to implement inner class and accessibility of members between classes
class Outer
{
    private int num1=100;       // private is also available in inner class

    void outDisplay()
    {
        Inner in = new Inner();     // if we don't create object then compiler won't know where is (num2) member of inner class, if we want to use inner class member from outer class.
        System.out.println("Member of outer class and it's value is " +num1);
        System.out.println("Member of inner class and it's value is "+in.num2);
    }
    class Inner
    {
        int num2=12;
        void inDisplay()
        {
            System.out.println("Sum of Outer member and Inner member is "+(num1+num2));
        }
    }
}

public class InnerClassDemo
{
    public static void main(String[] args)
    {
        Outer o = new Outer();
        o.outDisplay();
        // Inner in = new Inner();      //gives error because inner class isn't visible without pointing outer class
        Outer.Inner in = o.new Inner();
        in.inDisplay();
    }
}
