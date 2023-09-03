import java.util.Scanner;
class Cal
{
    double res=0;
    String x;
    Scanner c = new Scanner(System.in);

    void set(int opt)
    {
        System.out.println("Enter two numbers to be calculated : ");
        int a= c.nextInt();
        int b= c.nextInt();
        switch (opt)
        {
            case 1:
                res=a+b;
                x="addition";
                break;
            case 2:
                res=a-b;
                x="subtraction";
                break;
            case 3:
                res=a*b;
                x="multiplication";
                break;
            case 4:
                res=a/b;
                x="division";
                break;
        }
    }
    void get()
    {
        System.out.println("Your result after "+x+" is : "+res);
    }
    boolean ret(boolean p)
    {
        System.out.println("\nDo you want to calculate again? \n\nIf Yes then enter 'true' \n\nElse Enter 'false' terminate.");
        Scanner more=new Scanner(System.in);
        p= more.nextBoolean();
        return p;
    }
}
public class Calculator
{
    public static void main ( String [] args)
    {
        boolean r=true;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("\nChoose what you want to calculate");
            System.out.println("1 for Addition");
            System.out.println("2 for Subtraction");
            System.out.println("3 foe Multiplication");
            System.out.println("4 for Division");
            int opt = in.nextInt();

            if(opt>0&&opt<=4) {
                Cal c = new Cal();
                c.set(opt);
                c.get();
                r=c.ret(r);

            }
            else{
                System.out.println("Please choose valid option");
            }
        }while(r == true);
    }
}
