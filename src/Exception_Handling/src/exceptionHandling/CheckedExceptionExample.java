package exceptionHandling;

public class CheckedExceptionExample
{
    int var=121;
    public void display()
    {
        System.out.println("Value of the variable:" +var);
    }

    public static void main(String[] args) {
        CheckedExceptionExample er=new CheckedExceptionExample();
        er.display();

        try
        {
            Thread.sleep(10000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
