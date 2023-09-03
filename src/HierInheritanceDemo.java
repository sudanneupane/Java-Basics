class P1
{
    P1()
    {
        System.out.println("Parent class");
    }

}
 class Ch1 extends P1
 {
     Ch1()
     {
         System.out.println("Child1 class");
     }

 }
 class Ch2 extends P1
 {
     Ch2()
     {
         System.out.println("Child2 class");
     }

 }




public class HierInheritanceDemo
{
    public static void main(String[] args)
    {
        Ch1 ob1= new Ch1();
        Ch2 ob2= new Ch2();
    }
}
