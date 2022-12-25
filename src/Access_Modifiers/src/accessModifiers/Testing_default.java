package accessModifiers;

public class Testing_default {

    public static void main(String[] args) {
	// write your code here
        Def obj= new Def();
        obj.example_def();
        //obj.example_pri();
        obj.example_pro();

    }
}

class Def{
    protected int a=143;
    int a1=143;
    private int a2=143;
    public int a3=143;
    void example_def()
    {
        System.out.println("This a default method statement in class Def from the file Testing_default.");
    }
    private void example_pri()
    {
        System.out.println("This a private method statement in class Def from the file Testing_default.");
    }
    protected void example_pro()
    {
        System.out.println("This a protected method statement in class Def from the file Testing_default.");
    }

}

class Pro
{
    protected void ex_pro()
    {
        System.out.println("Using protected from class Pro in Testing_default.");
    }
}