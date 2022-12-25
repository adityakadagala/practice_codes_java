package mapAndHashMap;

import java.util.Iterator;
import java.util.Map;

public class testHashMap {
    public static void main(String[] args) {
        String s1= new String("Happy");
        String s2= new String("Happy");
        String s3= "Happy";
        String s4="Happy";
       // System.out.println(s1==s2);
        HashMapExample obj= new HashMapExample();
        Iterator<Map.Entry<String, String>> itr=obj.Dict.entrySet().iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
            System.out.println("count");
        }
    }
}
