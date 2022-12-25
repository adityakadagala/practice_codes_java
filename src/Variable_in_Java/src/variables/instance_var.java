package variables;

public class instance_var {
    int z=3;
    public static void main(String[] args) {
	// write your code here
        //System.out.println(z);
        //System.out.println(a);
        inst ins= new inst();
        System.out.println(ins.a);
        ins.display();

    }
}
class inst{
    int a=2;
    void display()
    {
        System.out.println("Variable accessed through method display:"+a);
    }
}