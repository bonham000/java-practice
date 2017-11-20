import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConvertHTML {

    private final String testArgument = "Dolce & Gabbana & Tacos \'\'\"\"and <div> hello";
    private final String expected = "Dolce &amp; Gabbana &amp; Tacos and &lt;div&gt; hello";

    private String convert(String plainText) {
        String result = plainText;
        HashMap replacementTable = new HashMap<String, String>() {{
            put("&", "&amp;");
            put("<", "&lt;");
            put(">", "&gt;");
            put("\"", "");
            put("\'", "");
        }};
        Iterator it = replacementTable.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            result = result.replace((String) entry.getKey(), (String) entry.getValue());
        }
        return result;
    }

    public void run() {
        System.out.println("Running ConvertHTML...");
        String result = convert(testArgument);
        Test t = new Test();
        t.test(expected, result);
    }
}
