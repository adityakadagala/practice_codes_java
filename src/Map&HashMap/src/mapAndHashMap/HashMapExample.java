package mapAndHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    //HashMap<String, String> Dict=new HashMap<String, String>();
   public static HashMap<String, String> Dict=new HashMap<String, String>();
        //Dict.put("No-brainer","Something that is really obvious or easy");
        //Dict.put("Sever ties", "To end a relationship");
        //Dict.put("Long shot","Something that has a very low probability of happening.");
    public HashMap<String, String> getHash()
    {
        HashMap<String, String> Dict=new HashMap<String, String>();
        Dict.put("No-brainer","Something that is really obvious or easy");
        Dict.put("Sever ties", "To end a relationship");
        Dict.put("Long shot","Something that has a very low probability of happening.");
        return Dict;
    }
    public static void main(String[] args) {
        // write your code here
        //HashMap<String, String> Dict=new HashMap<String, String>();
        //Dict.put("No-brainer", "Something that is really obvious or easy");
        //Dict.put("Sever ties", "To end a relationship");
        //Dict.put("Long shot", "Something that has a very low probability of happening.");
        Object sar = Dict;
        System.out.println(Dict);
        String var = Dict.get("Long shot");
        System.out.println("" + var);
       /* for(Map.Entry<String, String> val:Dict.entrySet())
        {
            System.out.println(val.getKey()+":"+val.getValue());
        }

        Dict.forEach((key, value)-> System.out.println(key+":"+value));*/

           Iterator<Map.Entry<String, String>> itr=Dict.entrySet().iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
            System.out.println("count");
        }

    }

}
