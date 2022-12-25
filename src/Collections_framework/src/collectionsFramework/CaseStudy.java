package collectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class CaseStudy
{
    public static void main(String[] args)
    {
        ArrayList<Integer> var= new ArrayList();
        var.add(32);
        var.add(12);
        var.add(123);
        var.add(52);
        System.out.println();

        Iterator<Integer> i=var.iterator();
        while(i.hasNext())
        {
            Integer val=  i.next();
            System.out.println(val);
        }

    }
}
