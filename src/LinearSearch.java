import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number of elements you want.");
        Scanner N= new Scanner(System.in);
        int x=N.nextInt();
        int search ,flag=0, i=0;
        int arr[] = new int [x];
        System.out.println("Enter the elements you want.");
        for(i=0;i<x;i++)
        {
            arr[i]=N.nextInt();

        }
        System.out.println("Enter the elements you want to search .");
        search=N.nextInt();
        for(i=0;i<x;i++) {
            if (arr[i] == search) {
                System.out.println("Number found at " + i + " position of the array");
                flag++;
            }
        }
            if (flag==0) {
                System.out.println("Number not found");
            }
            else {
                System.out.println("Occurrence = " + flag);
            }
    }
}
