package variables;

public class static_var {
    static int a=21;
    void display()
    {
        System.out.println(a);
    }
    static void disp()
    {
        System.out.println("Access through Static method display:" + a);
    }
    public static void main(String[] args)
    {
        System.out.println(a);
        static_var A= new static_var();
        A.display();
        disp();
        //System.out.println();

    }
}
