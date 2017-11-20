import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class SumAllPrimes {
    LinkedHashMap<Integer, Integer> cases = new LinkedHashMap<Integer, Integer>() {{
        put(10, 17);
        put(977, 73156);
    }};

    private boolean isPrime(Integer num, Integer current) {
        if (current == 1) {
            return true;
        } else if (num % current == 0) {
            return false;
        } else {
            Integer next = current - 1;
            return isPrime(num, next);
        }
    }

    private boolean isPrime(Integer num) {
        if (num == 1) return false; // 1 is not prime
        Integer first = num - 1;
        return isPrime(num, first);
    }

    private Integer sumAll(Integer limit) {
        Integer current = limit;
        Integer sum = 0;
        while (current > 0) {
            if (isPrime(current)) {
                sum += current;
            }
            current--;
        }
        return sum;
    }

    public void run() {
        System.out.println("Running SumAllPrimes...");
        Test t = new Test();
        Iterator it = cases.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry kv = (Map.Entry) it.next();
            Integer key = (Integer) kv.getKey();
            Integer value = (Integer) kv.getValue();
            System.out.println("Argument: " + key);
            Integer result = sumAll(key);
            t.test(value, result);
        }
    }
}
