public class ArrayDemo
{
    public static void main(String args[])
    {
        int a[] = new int[3];  //array declaration
        a[0]=10;    //array assignment
        a[1]=11;
        a[2]=12;
        int b[]={10,32,24,43,45};   //array initialization
                                        //int a; variable declaration
        System.out.println("A element are");
       /* for(i=0;i<a.length;i++)         //length takes the size of array
        {
            System.out.println(a[i]);
        }
        System.out.println("B element are");
        i=0;
        do{
            System.out.println(b[i]);
            i++;
        }while(i<b.length);
         for(i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }*/
        for(int i:a) //for each , here i is iterator and a is the array variable
        {
            System.out.println(i);
        }
        System.out.println("B element are");
        for(int i=0;i<b.length;i++)         //length takes the size of array
        {
            System.out.println(b[i]);
        }
    }
}
