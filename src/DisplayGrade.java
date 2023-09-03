//Program to find Grade and GPA ( Grade point Average ) of a student if percentage is given.
class Stu
{
    private int usn;
    private String name;
    private double per;
    private double gpa;
    private String gpaDescription;
    private String grade;

    void set(int u, String n, double p )
    {
        usn=u;
        name=n;
        per=p;
        gpa= per/25;

        if(gpa>=3.6&&gpa<=4)
        {
            gpaDescription = "Outstanding";
            grade = "A+";
        }
        else if (gpa>=3.2&&gpa<3.6) {
            gpaDescription = "Excellent";
            grade="A";
        }
        else if (gpa>=2.8&&gpa<3.2)
        {
            gpaDescription = "Very Good";
            grade = "B+";
        }
        else if (gpa>=2.4&&gpa<2.8) {
            gpaDescription = "Good";
            grade = "B";
        }
        else if (gpa>=2.0&&gpa<2.4) {
            gpaDescription = "Above Average";
            grade = "C+";
        }
        else if (gpa>=1.6&&gpa<2.0) {
            gpaDescription = "Average";
            grade = "C";
        }
        else if (gpa>=0.8&&gpa<1.6)
        {
            gpaDescription = "Below Average";
            grade = "D";
        }
        else if (gpa>0)
        {
            gpaDescription = "Insufficient";
            grade = "E";
        }
        else
        {
            gpaDescription = "Null";
            grade = "N";
        }


    }
    void get()
    {
        System.out.println("\nRoll no.: "+usn+"\nStudent name: "+ name+"\nYour Grade is : "+grade+
                "\nYour result in GPA ( Grade Point Average ) is : "+gpa+ "\nYou completed your Semester with " +
                "" +gpaDescription +" Performance");
    }
}


public class DisplayGrade
{
    public static void main(String[] args)
    {
        Stu s=new Stu();
        s.set(123,"Prakash",51);
        s.get();

    }
}
