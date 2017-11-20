import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class SortedUnion {

    private List<Integer> sortedUnion(ArrayList<Integer>... arrays) {
        LinkedHashSet uniq = new LinkedHashSet();
        Arrays.stream(arrays).forEach(a -> a.stream().forEach(e -> uniq.add(e)));
        return new ArrayList<Integer>() {{ addAll(0, uniq); }};
    }

    private void test() {
        ArrayList<Integer> arg1 = new ArrayList<>(Arrays.asList(2,4,7,14,4,2,14));
        ArrayList<Integer> arg2 = new ArrayList<>(Arrays.asList(1,3,5,7,1,5,7,4));
        ArrayList<Integer> arg3 = new ArrayList<>(Arrays.asList(5,9,13,12,7,14));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,4,7,14,1,3,5,9,13,12));
        List<Integer> result = sortedUnion(arg1, arg2, arg3);

        Test t = new Test();
        t.test(expected, result);
    }

    public void run() {
        System.out.println("Running SortedUnion...");
        test();
    }
}
