////Program to make a pattern
//public class Pattern
//{
//    public static void main(String[] args)
//    {
//        int i, n=4;     //n is used for limiting the loop. We can even make it as a user input to let user decide how much long loop user wants.
//        String star="1";
//        for(i=1; i<=n; i++)
//        {
//            if (i==2){
//                continue;}
//                for (int j = 1; j <= i; j++)
//                {
//                    System.out.print(star);
//                }
//                System.out.println("");
//        }
//    }
//}

//Program to make a pattern
public class Pattern {
    public static void main(String[] args) {
        int i, n = 3;     //n is used for limiting the loop. We can even make it as a user input to let user decide how much long loop user wants.
        String star = "1";
        for (i = 0; i <= 3; i++) {
            System.out.print("1");
            for (int j = 0; j <3; j++) {
                if(i<2){
                System.out.print("0");}
            }
        }
    }
}