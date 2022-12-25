package exceptionHandling;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try{
            int stdID[]= new int[6];
            stdID[0]=1234243;
            stdID[1]=1231321;
            stdID[2]=1231231;
            stdID[3]=1242131;
            stdID[4]=1232131;

            System.out.println(stdID[8]);
        } catch( ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out of bounds");
        }
        catch(Exception  e)
        {
            System.out.println("Interrupted Exception");
        }
    }
}
