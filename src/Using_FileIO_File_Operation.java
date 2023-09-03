import java.io.*;
public class Using_FileIO_File_Operation
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {

        File f1 = new File("E:/College/3rd Semester/Object Oriented Programming using JAVA/Java_Lab_Exam/input.txt");
        File f2 = new File("E:/College/3rd Semester/Object Oriented Programming using JAVA/Java_Lab_Exam/output.txt");
        if(!f1.exists()) // If file is not created then create file
            f1.createNewFile();
        FileInputStream in = new FileInputStream(f1);
        FileOutputStream out= new FileOutputStream(f2);
        int k;
        while ((k=in.read())!=-1){
            System.out.println((char)k);
        }
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);      // writing
        }
        File f= new File("data.txt");
        if(f.createNewFile()){
            System.out.println("data.txt File created");
        }
        boolean de= f.delete();  // File deletion
        System.out.println("data.txt File deleted = "+de);


    }
}
