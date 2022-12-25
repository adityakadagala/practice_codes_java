package collectionsFramework;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> var= new ArrayList<String>();
        var.add("Iterm 1");
        var.add("Item 2");
        var.add("Item 3");
        var.add("Item 4");
        String key= var.get(1);
        System.out.println("Second element:"+key);
        System.out.println("Elements list: "+var);

        ArrayList<Integer> var2= new ArrayList();
        var2.add(21);
        var2.add(12);
        var2.add(31);
        var2.add(21);
        var2.add(12);

        for(int i:var2)
        {
            System.out.println(i);
        }
    }
}
