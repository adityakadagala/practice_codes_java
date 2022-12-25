package datatypes;

public class primitiveDatatypes {

    public static void main(String[] args) {
	// write your code herea
        boolean ctr = true;
        short var=12213;
        byte var2= 127;
        int var4= 1599999;
        char var3='\u0051';
        char var3a='Q';
        long var5= 1999999999;
        float var6= 12.0121288888888888888888888888888888888888f;
        double var7=123.121231231299999999999999999999993d;


        System.out.println("Boolean variable:"+ctr);
        System.out.println("Byte variable:"+var2);
        System.out.println("Short variable:"+var);
        System.out.println("Int variable:"+var4);
        System.out.println("Char variable:"+var3);
        System.out.println("Char variable:"+var3a);
        System.out.println("Long variable:"+var5);
        System.out.println("Float variable:"+var6);
        System.out.println("Double variable:"+var7);

        System.out.println("Type conversion from float to double:"+(var7+var6));
        System.out.println("Type conversion from long to double:"+(var7+var5));
        System.out.println("Type conversion from int to double:"+(var7+var4));
        System.out.println("Type conversion from int to float:"+(var4+var6));
        System.out.println("Type conversion from byte to int:"+(var2+var4));
        System.out.println("Type conversion byte to short:"+(var2+var));
    }
}
