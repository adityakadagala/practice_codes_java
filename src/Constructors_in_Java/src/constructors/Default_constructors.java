package constructors;

public class Default_constructors {
    public Default_constructors()
    {
        System.out.println("Default constructor");
    }

    void display()
    {
        System.out.println("Method display executed");
    }

    public static void main(String[] args) {
	// write your code here
        Default_constructors obj= new Default_constructors();
        obj.display();
    }
}
