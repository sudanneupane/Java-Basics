//import java.util.*;   it brings all class of util
import java.util.ArrayList;     // it brings only ArrayList class of util
public class VarLenArray
{
    public static void main( String args[])
    {
        int n=15;
        ArrayList<Integer> al=new ArrayList<Integer>(n);        //<Integer> only integer data type is used
        al.add(11);
        al.add(13);
        for (int i=0;i<4;i++)
        {
            al.add(i);
        }
        System.out.println(al);
        System.out.println("Size of array is: " +al.size());
        al.remove(2);
        System.out.println(al);
        System.out.println("Size of array is: " +al.size());
    }
}
