public class MultiplicationTable {
    public static void main(String[] args) {
        for(int n=6;n<=10;n++) {
            for (int i = 1; i <= 10; i++)
            {
                System.out.println(n + "x" + i + "= " + (n * i));
            }
        }
    }
}
