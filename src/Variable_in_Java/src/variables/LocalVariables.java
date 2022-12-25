package variables;

public class LocalVariables {
    public void display()
    {
        int height=12;
        height+=1;
        System.out.println(height);
    }
    public static void main(String[] args)
    {
        LocalVariables obj=new LocalVariables();
        obj.display();
    }
}
