package exceptionHandling;

public class ThrowExample {
    static void checkAge(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Access denied- You are underage");
        }
        else
        {
            System.out.println("Access granted");
        }
    }
    public static void main(String[] args) {
        checkAge(12);
    }
}
