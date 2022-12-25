package encapsulation;
class Student
{
    private int studentId;
    private String studentName;

    int getStudentID()
    {
        return studentId;
    }
    void setStudentId(int studentId)
    {
        this.studentId=studentId;
    }
    String getStudentName()
    {
        return studentName;
    }
    void setStudentName( String studentName)
    {
        this.studentName= studentName;
    }
}
public class EncapsulationExample {

    public static void main(String[] args) {
	// write your code here
        Student obj=new Student();
        //obj.studentId=12;
       // obj.studentName="Name";
        obj.setStudentId(213421);
        System.out.println(obj.getStudentID());
        obj.setStudentName("Vijay");
        System.out.println(obj.getStudentName());

    }
}
