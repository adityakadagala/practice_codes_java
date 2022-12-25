package contolStatements;

public class BreakStmts {

    public static void main(String[] args) {
	// write your code here
        for(int i=0;i<=10;i++)
        {
            for(int j=0;j<12;j++)
            {
                if (j==6){
                    break;
                }
                System.out.println(j);
            }
        }
    }
}
