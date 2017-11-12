import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizeWords {
    private ArrayList<String> names = new ArrayList<String>() {{
        add("ron");
        add("sean");
        add("sze wai");
    }};

    interface Fn<A, B> {
        public A trns(B e);
    }

    private List<String> applyTransformation(ArrayList<String> names, Fn<String, String> transformer) {
        return names
                .stream()
                .map(s -> transformer.trns(s))
                .collect(Collectors.toList());
    }

    public void run() {

        Fn<String, String> transformer = new Fn<String, String>() {
            public String trns(String s) {
                String[] words = s.split(" ");
                int idx = 0;
                String result = "";
                for (String w:words) {
                    idx++;
                    result += w.substring(0, 1).toUpperCase() + w.substring(1);
                    if (idx > 0 && idx < words.length) result += " ";
                }
                return result;
            };
        };

        System.out.println(applyTransformation(names, transformer));

    }
}
