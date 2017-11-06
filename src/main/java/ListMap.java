import java.util.LinkedList;
import java.util.LinkedHashMap;

public class ListMap {

    private static void inspect(LinkedList<LinkedHashMap<String, String>> list) {
        System.out.println(list.size());
        for (LinkedHashMap<String, String> map:list) {
            map.entrySet()
                    .stream()
                    .forEach(e ->System.out.println(e.getValue()));
        }
    }

    public static void run() {
        LinkedList<LinkedHashMap<String, String>> complexList = new LinkedList<LinkedHashMap<String, String>>() {{
            add(new LinkedHashMap<String, String>() {{
                put("Key", "Value" );
                put("A", "B");
                put("C", "D");
            }});
            add(new LinkedHashMap<String, String>() {{
                put("OtherKey", "OtherValue" );
                put("SomeKey", "SomeValue");
            }});
        }};

        System.out.println(complexList);
        inspect(complexList);
    }
    
}
