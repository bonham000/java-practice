import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class SumOddFibonacci {
    private final LinkedHashMap<Integer, Integer> cases = new LinkedHashMap<Integer, Integer>() {{
        put(1, 1);
        put(4, 5);
        put(1000, 1785);
        put(75024, 60696);
        put(75025, 135721);
        put(4000000, 4613732);
    }};

    private Integer sumOdds(Integer limit, Integer prev, Integer current, Integer sum) {
        if (current > limit) {
            return sum;
        } else {
            if (current % 2 != 0) {
                sum += current;
            }
            if (current == limit) {
                return sum;
            }
        }

        return sumOdds(limit, current, prev + current, sum);
    }

    private Integer sumOdds(Integer num) {
        return sumOdds(num, 1, 1, num == 1 ? 0 : 1);

    }

    public void run() {
        System.out.println("Running SumOddFibonacci...");
        boolean allClear = true;

        Test t = new Test();
        Iterator it = cases.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Integer result = sumOdds((Integer) entry.getKey());
            System.out.println("Argument: " + entry.getKey());
            boolean passed = t.test(entry.getValue(), result);
            if (!passed) allClear = false;
            System.out.println("");
        }

        if (allClear) {
            System.out.println("All tests passed!");
        } else {
            System.out.println("Not all tests passed!");
        }

    }
}
