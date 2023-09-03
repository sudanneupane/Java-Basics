public class MinMaxArray
{
    public static void main(String args[])
    {
        int arr[] = { 11,12,13,14,15,23,43,54,65,1};
        int min=arr[0] , max=0;
        System.out.println("Program to fnd the min and max value in the array");
        System.out.println("Array element are");
        for (int i:arr)
        {
            System.out.println(i);
        }
        for (int i:arr)
        {
            if(i<min)
            {
                min=i;
            }
            if(i>max) {
                max = i;
            }
        }
        System.out.println("Min value: "+ min+ " Max value: "+max);
    }
}
