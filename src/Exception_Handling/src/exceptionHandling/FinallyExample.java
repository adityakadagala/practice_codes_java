package exceptionHandling;

public class FinallyExample {
    public static void main(String[] args) {
        try{
            int[] var={1,2,4,3};
            System.out.println(var[10]);

        }catch (Exception e)
        {
            System.out.println("Error");
        }
        finally {
            System.out.println("The try and catch block has been executed");
        }
    }
}
