package accessModifiers;

public class Case_Study_2
{
    public static void main(String[] args)
    {
        Def obj= new Def();
        System.out.println("Protected variable:"+obj.a);
        System.out.println("Default variable:"+obj.a1);
        //System.out.println(obj.a2);
        System.out.println("Public variable:"+obj.a3);
        test imo= new test();
        System.out.println("Accessing private variable of class test:"+imo.var2);


    }
}

class test
{
    private int var1=143;
    int var2=var1;

}