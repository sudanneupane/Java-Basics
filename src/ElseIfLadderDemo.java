// program to check eligibility to get reservation for government job
public class ElseIfLadderDemo
{
    public static void main(String args[])
    {
        int result = 60; // Criteria 1
        boolean isSport = true;     //criteria 2
        String name = "Suvadip";
        if (result >= 80)
        {
            System.out.println(name+ " You have reservation eligibility because of your good result !");
        }
        else if (isSport == true)
        {
            System.out.println(name+ " You have reservation  eligibility because of your sports quota !");
        }
        else
        {
            System.out.println(name+ " Sorry! you have not passed any eligibility ");
        }
        System.out.println("further code");
    }
}
