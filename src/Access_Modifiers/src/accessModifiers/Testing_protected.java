package accessModifiers;

public class Testing_protected
{
    public static void main(String[] args)
    {
        Def obj = new Def();
        obj.example_pro();
        obj.example_def();
        System.out.println(obj.a);
        System.out.println(obj.a1);
        //System.out.println(obj.a2);
        System.out.println(obj.a3);
        Pro var = new Pro();
        var.ex_pro();
    }
}
