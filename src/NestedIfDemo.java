public class NestedIfDemo
{
    public static void main(String args[])
    {
        int age=15;
        String name ="Jannatul";
        String country="ijk";
        if(country=="XYZ")
        {
            if(age>=18)
            {
                System.out.println(name+" you are eligible to vote");
            }
            else
            {
                System.out.println(name+" Sorry, age for voting must be at least 18!");
            }
        }
        else
        {
            System.out.println(name+" Sorry you are not te resident of XYZ country to be part of voting");
        }
        System.out.println("Further code");
    }
}
