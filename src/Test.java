/* import java.lang.*; // default imported
class Object  // we do not need to write this because it is already there by default
{

}

 */

class Cube
{
    double width;
    double height;
    double depth;
    // construct clone of an object
    Cube(Cube ob)
    {
// pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // constructor used when all dimensions specified
    Cube(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    // constructor used when no dimensions specified
    Cube()
    {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }
    // constructor with one parameter only
    Cube(double len)
    {
        width = height = depth = len;
    }
    // method to compute and return volume
    double volume()
    {
        return width * height * depth;
    }
}
class Test
{
    public static void main(String args[])
    {
// create cubes using the various constructors
        Cube box1 = new Cube(10, 20, 15);
        Cube box2 = new Cube();
        Cube perfectCube = new Cube(7);
        Cube clone1 = new Cube(box1);
        double vol;
// get volume of first box
        vol = box1.volume();
        System.out.println("Volume of box1 is " + vol);
// get volume of second box
        vol = box2.volume();
        System.out.println("Volume of box2 is " + vol);
// get volume of cube
        vol = cube.volume();
        System.out.println("Volume of perfectCube is " + vol);
// get volume of clone1
        vol = clone1.volume();
        System.out.println("Volume of clone1 is " + vol);
        box2.width=5;
        box2.height=10;
        box2.depth=15;
        Box clone2 = new Box(box2);
// get volume of clone1
        vol = clone2.volume();
        System.out.println("Volume of clone2 is " + vol);
    }
}
//public class Test
//{
//    public static void main(String[] args)
//    {
//
//    }
//}
