package exceptionHandling;

public class TryCatch {

    public static void main(String[] args) {
	// write your code here
        try{
            int[] var= {1,2,3,4};
            System.out.println(var[4]);
        } catch (Exception e)
        {
            //System.out.println();
            int var=21;
            System.out.println(++var);

        }
    }
}
