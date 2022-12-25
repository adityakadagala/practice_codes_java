public class MethodOverriding_example {
    public static void main(String[] args) {
        ParentClass obj1= new ParentClass();
        ChildClass obj2= new ChildClass();
        obj1.disp();
        obj2.disp();
    }
}

class ParentClass
{
    public void disp()
    {
        System.out.println("Parent Class is called");
    }
}
class ChildClass extends ParentClass
{
    public void disp()
    {
        System.out.println("Child CLass is called");
    }
}