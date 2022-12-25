import java.util.Collections;
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> l= new LinkedList<String>();
        l.add("as");
        l.add("asd");
        l.add("asd");
        l.add("asd");
        l.add("ad");
        l.add("asd");
        LinkedList<String> duplicate=new LinkedList<String>();
        duplicate.addAll(l);
        System.out.println(duplicate);
        System.out.println("Elements in the linked list: "+l);
        Collections.sort(l);
        System.out.println("Elements in the Linked list after sorting: " +l);
        Collections.sort(l, Collections.reverseOrder());
        System.out.println("Elements in the Linked list after sorting in reverse order");
        Collections.shuffle(l);
        System.out.println("Elements in the linked list after shuffling: " +l);

    }
}
