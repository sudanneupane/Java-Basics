/*class Stu
{
    private int usn;
    private String name;
    private double res;
    int threeM[]=new int[3];

    void set(int u, String n, double r )
    {
        usn=u;
        name=n;
        res=r;
    }
    void get()
    {
        System.out.println("Roll no."+usn+" Student name: "+ name+" Result: "+res);
    }
}

public class OneDimArray
{
    public static void main (String args[])
    {
        int i, n=3;
        Stu s[]=new Stu[3];
        s[0].get();
        s[0].set(123,"ac",90.9);
    }
}*/

public class OneDimArray
{
    public static void main (String args[])
    {
        int i;
        int a[]={10,20,39}; //array initialization
        //int b[; //cannot be used ,because no memory allocated to it
        int b[]= new int[3]; //array declaration and reserves 12 bytes of memory
        for(i=0;i<3;i++)
            System.out.println(b[i]);
    }
}