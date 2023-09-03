public class MultiArray
{
    public static void main(String args[])
    {
        int a[][] =new int[2][2];       //2D array deceleration
        a[0][0]=10;
        a[0][1]=11;     //2D array assignment
        a[1][0]=13;
        a[1][1]=2;

        int b[][]={{1,2},{3,4}};
        int c[][]=new int[2][2];
        System.out.println("A matrix element are");
        for(int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.print(a[i][j] +"\t");
            }
            System.out.print("\n");
        }
        System.out.println("B matrix element are");
        for(int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.print(b[i][j] +"\t");
            }
            System.out.print("\n");
        }

        for(int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Matrix addition are");
        for(int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.print(c[i][j] +"\t");
            }
            System.out.print("\n");
        }

    }
}
