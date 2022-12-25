package genericsFramework;
import java.util.*;

public class  LinkedListDemo
{

    public static void main(String[] args) {
	// write your code here
        LinkedList<Comparable> l= new LinkedList<Comparable>();
        l.add(121);
        l.add("text");
        l.add(12.3);
        l.add('A');
        l.add(true);

        System.out.println(l);
        System.out.println("Number of elements in Linked List:" +l.size());
        l.add(2, "Replacement");
        System.out.println(("After insertion: "+l));

        System.out.println(l.get(3));
        l.set(0,111);
        System.out.println(l.contains(111));
        System.out.println(l.contains(1111));
        System.out.println(l.isEmpty());

        for (int i=0; i<l.size();i++)
        {
            System.out.println(l.get(i));
        }

        for (Object i:l)
        {
            System.out.println(i);

        }

        Iterator<Comparable> itr=l.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
