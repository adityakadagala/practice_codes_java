package inheritance;

public class ChildClass extends BaseClass
{
    public void mul()
    {
        System.out.println("Multiplication");
    }
    public void div()
    {
        System.out.println("Division");
    }
    public static void main(String[] args)
    {
        ChildClass obj= new ChildClass();
        System.out.println("Reference through Child Class");
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        System.out.println("Reference through Base Class");
        BaseClass var=new BaseClass();
        var.add();
        var.sub();
    }
}
