import java.util.ArrayList;
import java.util.stream.Collectors;

public class SeekAndDestroy {
    public ArrayList<Integer> destroyer(ArrayList<Integer> array, Integer... args) {
        ArrayList<Integer> exclude = new ArrayList<Integer>() {{
            for (Integer i:args) add(i);
        }};
        return array
                .stream()
                .filter(e -> !exclude.contains(e))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
