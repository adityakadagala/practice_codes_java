package mapAndHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // write your code here
        TreeMap<String, String> Dict = new TreeMap<String, String>();
        Dict.put("No-brainer", "Something that is really obvious or easy");
        Dict.put("Sever ties", "To end a relationship");
        Dict.put("Long shot", "Something that has a very low probability of happening.");

        System.out.println(Dict);
        String var = Dict.get("Long shot");
        System.out.println("" + var);
        for (Map.Entry<String, String> val : Dict.entrySet()) {
            System.out.println(val.getKey() + ":" + val.getValue());
        }
        Dict.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
