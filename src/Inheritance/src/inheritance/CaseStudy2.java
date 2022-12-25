package inheritance;

class Teacher
{
    String designation="Teacher";
    String collegeName= "ABD College";
    public Teacher()
    {
        System.out.println(collegeName);
        System.out.println(designation);

    }
}

class ComputerTeacher extends Teacher
{
    String mainSubject="Physics";
    public ComputerTeacher()
    {
        System.out.println(mainSubject);
    }

}
public class CaseStudy2 {
    public static void main(String[] args)
    {
        ComputerTeacher obj= new ComputerTeacher();
       //System.out.println(obj.collegeName);
        //System.out.println(obj.designation);
        //System.out.println(obj.mainSubject);
    }
}
