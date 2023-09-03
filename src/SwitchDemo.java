//program to demonstrate the music player
public class SwitchDemo
{
    public static void main(String args[])
    {
        int op=2;
        System.out.println("Select from below songs: \n1. Friends \n2. Fearless pt2\n");
        switch(op)
        {
            case 1:
                System.out.println("Playing song 'Friends' ");
                break;
            case 2:
                System.out.println("laying song 'Fearless pt2' ");
                break;
            default:
                System.out.println("Sorry!, We can not play you chosen song now! ");
        }
        System.out.println("Further code");
    }
}
