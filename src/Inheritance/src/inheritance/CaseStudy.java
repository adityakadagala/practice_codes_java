package inheritance;

public class CaseStudy extends Animal {
    public CaseStudy(String a, String b, String c)
    {
        name= a;
        colour=b;
        breed=c;

    }
    public static void main(String[] args){
        CaseStudy obj=new CaseStudy("Dog","Black","Labrador");
        obj.display();
        System.out.println("Your pet is a "+obj.colour+" coloured "+obj.name+" of the breed "+obj.breed);
    }
}

class Animal
{
    public String name="Animal";
    public String colour="White";
    public String breed="Default";

    void display()
    {
        System.out.println("Accessing Parent class");
    }
}
