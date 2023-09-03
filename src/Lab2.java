abstract class Shape
{
    String shapeName;
    final double PI=3.14;

    abstract void area();
    public String toString() // in object class toString is public so, we can't use it in default
    {
        return shapeName;
    }
}
class Sphere extends Shape
{
    int r;
    Sphere(int x)
    {
        r=x;
    }
    void area()
    {
        System.out.println("Area of sphere = "+ 4*PI*r*r);
    }
}
class Rectangle extends Shape
{
    int l,w;
    Rectangle(int x, int y)
    {
        l=x;
        w=y;
    }
    void area()
    {
        System.out.println("Area of rectangle = " +(l*w));
    }
}
class Triangle extends Shape
{
    int b,h;
    Triangle( int i, int j)
    {
        b=i;
        h=j;
    }
    void area()
    {
        System.out.println("Area of triangle is = "+(0.5*b*h));
    }
}
class Sh
{
    void disp()
    {
     //   Shape s= new Shape()        //'Shape' is abstract; cannot be instantiated
        // we can not create object of abstract class.
    Sphere sp= new Sphere(2);
    sp.area();
    Rectangle re =new Rectangle (4,6);
    re.area();
    Triangle t = new Triangle(2,3);
    t.area();
    }
}

public class Lab2
{
    public static void main(String[] args)
    {
        Sh ob= new Sh();
        ob.disp();
    }
}
