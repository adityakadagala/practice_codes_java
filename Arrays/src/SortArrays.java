public class SortArrays {
    public static void main(String[] args) {
        int[] arr={54,12,34,1,43,52};
        for (int i=1;i<=arr.length;i++)
        {
            for(int j=0;j<i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int j : arr) System.out.print(j + "\t");
        System.out.println(arr[0]);
    }
}
