package variables;

public class InstanceVariables
{
    public int rollNum;
    public String name;
    public int totalMarks;
    public int number;
    
    public static void main(String[] args)
{
    InstanceVariables obj= new InstanceVariables();
    obj.rollNum= 100001;
    obj.name= "test engineer";
    obj.totalMarks= 510;
    obj.number=12432235;
    System.out.println(obj.rollNum);
    System.out.println(obj.name);
    System.out.println(obj.totalMarks);
    System.out.println(obj.number);
}
}
