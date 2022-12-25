package constructors;

import com.sun.source.util.ParameterNameProvider;

public class Parameterized_constructors {
    public Parameterized_constructors(int a)
    {
        System.out.println(++a);
    }
    public Parameterized_constructors(float a)
    {
        System.out.println(++a);
    }
    public Parameterized_constructors(int a, int b)
    {
        System.out.printf("%d %d\n",++a,++b);
    }
    void display()
    {
        System.out.println("Overloaded parameterized constructors");
    }
    public static void main(String[] args)
    {
        Parameterized_constructors obj= new Parameterized_constructors(24);
        Parameterized_constructors obj1= new Parameterized_constructors(23.4f);
        Parameterized_constructors obj2= new Parameterized_constructors(12,13);
        obj.display();

    }
}
