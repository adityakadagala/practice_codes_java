package sets;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
	// write your code here
        LinkedHashSet<String> names= new LinkedHashSet<String>();
        names.add("text1");
        names.add("text2");
        names.add("text3");
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
