public class StringDemo
{
    public static void main(String[] args)
    {
       /* String s1 = "abc";      // string created as literal.

        String s2 = new String();       // string created as object with no value.

        char [] arr ={'a','b','b'}; //
        String s3=new String(arr);      // string created as object and value is char array argument.

        byte[] b = {'a','b','c'};
        String s4 = new String (b);     //// string created as object and value is byte array argument.

        String s5 = new String(s4);      //string created as object and value is another string.

        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);     // null because no value is given
        System.out.println("s3 = "+s3);
        System.out.println("s4 = "+s4);
        System.out.println("s5 = "+s5);
        */
        String s1 ="jain";
        String s2="university";
        String s3 ="Jain";
        String s4 ="Jain university";
        Integer num =10;

        char k = s1.charAt(2);
        System.out.println("charAt position 2 is "+k);
        System.out.println("charAt position 2 is "+s1.charAt(2));
        System.out.println("Length of string s2 is "+s2.length());
        System.out.println("Whether s1 and s2 are same ? " +s1.compareTo(s2));  //checks based on length and is case sensetive.
        System.out.println("Whether s1 and s2 are same ? " +s2.compareTo(s1));
        System.out.println("Whether s1 and s2 are same ? " +s1.compareTo(s1));
        System.out.println("Whether s1 and s2 are same ? " +s1.compareTo(s3));
        System.out.println("Whether s1 and s2 are same ? " +s1.compareTo(s4));
        System.out.println("Whether s1 and s2 are same ? " +s1.equals(s3));     //checks based on value and is case sensetive.
        System.out.println("Whether s1 and s2 are same ? " +s1.equalsIgnoreCase(s3));   //checks based on value and is case insensetive.
        System.out.println(s2.contains(s1));    // checks whether s1 is present in s2
        System.out.println(s4.contains(s3));
        System.out.println(s2.indexOf('u'));    //gives the position of a given character as argument
        System.out.println(s2.substring(2,5));  //gives the substring in s2 which is from position 2 to 4
        System.out.println(num.toString());
        System.out.println(s1.toUpperCase());

    }
}
