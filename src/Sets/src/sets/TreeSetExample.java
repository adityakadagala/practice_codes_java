package sets;
import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> names=new TreeSet<String>();
        names.add("text1");
        names.add("soup");
        names.add("work");
        names.add("text4");
        names.add("text5");
        names.add("text5");
        System.out.println("Elements are: " +names);

        for(String val:names)
        {
            System.out.println(val);
        }

    }
}
