import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class DropIt {
    private ArrayList<Integer> arg = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
    private cb<Integer, Boolean> fn1 = new cb<Integer, Boolean>() {
        @Override
        public Boolean check(Integer integer) {
            return integer >= 8 && integer % 2 == 0;
        }
    };
    private cb<Integer, Boolean> fn2 = (a) -> a >= 8 && a % 2 == 0;

    private interface cb<A, R> {
        public R check(A a);
    }

    private ArrayList<Integer> dropIt(ArrayList<Integer> input, cb<Integer, Boolean> callback) {
        return input.stream()
                .filter(e -> callback.check(e))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public void run() {
        System.out.println("Running DropIt...");
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(8,10,12,14));
        ArrayList<Integer> result1 = dropIt(arg, fn1);
        ArrayList<Integer> result2 = dropIt(arg, fn2);
        System.out.println("Result 1:");
        System.out.println(result1);
        System.out.println("Result 2:");
        System.out.println(result2);
        System.out.println("Expected:");
        System.out.println(expected);
    }
}
