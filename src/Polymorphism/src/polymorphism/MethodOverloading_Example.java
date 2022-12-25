package polymorphism;

class Overloading
{
    public void disp()
    {
        System.out.println("First disp method");
    }
    public void disp(String val)
    {
        System.out.println("Second disp method with one string input, "+val);
    }
    public void disp(String val, String var)
    {
        System.out.println("Third disp method with two string inputs, "+val+" " +var);
    }
}
public class MethodOverloading_Example {

    public static void main(String[] args) {
	// write your code here
        Overloading obj= new Overloading();
        obj.disp();
        obj.disp("String");
        obj.disp("string1","string2");
    }
}
