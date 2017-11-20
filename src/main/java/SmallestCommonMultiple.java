import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class SmallestCommonMultiple {
    private LinkedHashMap<int[], Integer> cases = new LinkedHashMap<int[], Integer>() {{
        int[] arg1 = {1, 5};
        int[] arg2 = {5, 1};
        int[] arg3 = {2, 10};
        int[] arg4 = {10, 2};
        int[] arg5 = {1, 13};
        int[] arg6 = {13, 1};
        int[] arg7 = {18, 23};
        int[] arg8 = {23, 18};
        put(arg1, 60);
        put(arg2, 60);
        put(arg3, 2520);
        put(arg4, 2520);
        put(arg5, 360360);
        put(arg6, 360360);
        put(arg7, 6056820);
        put(arg8, 6056820);
    }};

    private boolean checkMultiple(Integer current, Integer max, Integer multiple) {
        if (multiple % current == 0) {
            if (current == max) {
                return true;
            } else {
                return checkMultiple(current + 1, max, multiple);
            }
        } else {
            return false;
        }
    }

    private Integer findSmallestMultiple(int[] range) {
        Integer first = range[0];
        Integer second = range[1];

        Integer lower;
        Integer upper;

        if (second > first) {
            lower = first;
            upper = second;
        } else {
            lower = second;
            upper = first;
        }

        Integer current = upper + 1;
        while (!checkMultiple(lower, upper, current)) {
            current++;
        }
        return current;
    }

    public void run() {
        System.out.println("Running SmallestCommonMultiple...");
        Test t = new Test();

        Iterator it = cases.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry kv = (Map.Entry) it.next();
            int[] arg = (int[]) kv.getKey();
            Integer expected = (Integer) kv.getValue();
            Integer result = findSmallestMultiple(arg);
            System.out.println("Testing arguments: " + "[" + arg[0] + ", " + arg[1] + "]");
            t.test(expected, result);
        }
    }
}
