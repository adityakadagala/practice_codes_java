package hybridInheritance;
class A
{
    public A()
    {
        System.out.println("A");
    }
    public void display()
    {
        System.out.println("A");
    }
}
class B extends A{
    public B()
    {
        System.out.println("B");
    }
    public void display()
    {
        System.out.println("B");
    }
}
class C extends A
{
    public C()
    {
        System.out.println("C");
    }
    public void display()
    {
        System.out.println("C");
    }
}
class D extends C{
    public D()
    {
        System.out.println("D");
    }
    public void display()
    {
        System.out.println("D");
    }
}
public class HybridTest {
    public static void main(String[] args) {
        D obk= new D();
        obk.display();
    }
}
