class Demo
{
    int a,b,c;
    Demo(int a, int b, int c)
    {
        this.a=a;           //ob1.a=a   //this ( is an object ) which always points to current object
        this.b=b;           //ob1.b=b
        this.c=c;           //ob1.c=c
    }
    /*  Syntax for this:
            this.(member data)= something
     */
    void display()
    {
        System.out.println(a+b+c);
    }
}

public class ThisDemo
{
    public static void main(String[] args)
    {
        Demo ob1= new Demo(10,20,1);
        ob1.display();

    }
}
