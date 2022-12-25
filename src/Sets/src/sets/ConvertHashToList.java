package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertHashToList {
    public static void main(String[] args)
    {
        HashSet<String> names= new HashSet<String>();
        names.add("Varun");
        names.add("Raju");
        names.add("Vijaya");
        names.add("Manisha");
        System.out.println("Elements are:" +names);
        ArrayList<String> l=new ArrayList<String>(names);
        System.out.println("List output is:" +l.get(3) );
        //List can access elements individually
    }
}
