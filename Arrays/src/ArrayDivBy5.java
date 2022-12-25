public class ArrayDivBy5 {
    public static void main(String[] args) {
        int[] arr={12,14,15,25,43,70,40};
        for( int i=0;i<arr.length;i++)
        {
            if(arr[i]%5==0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
