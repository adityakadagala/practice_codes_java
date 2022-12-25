package multipleInheritance;
interface FirstInterface
{
    public void myMethod();
}
interface SecondInterface
{
    public void display();
}
public class InterfaceTest implements FirstInterface, SecondInterface
{
    public void myMethod()
    {
        System.out.println("Testing abstract Firstinterface ");
    }
    public void display()
   {
       System.out.println("Method inside SecondInterface");
   }
    public static void main(String[] args)
    {
        InterfaceTest obj= new InterfaceTest();
        obj.myMethod();
        obj.display();
    }
}
