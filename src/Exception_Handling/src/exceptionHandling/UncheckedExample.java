package exceptionHandling;

public class UncheckedExample {
    public static void main(String[] args) {
        try{
            int var=10/0;
            System.out.println("Division of 10 by 0:");
        }catch (ArithmeticException e)
        {
            System.out.println("Error with Arithmetic logic");
        }
        finally {
            System.out.println("This is finally block");
        }
    }
}
