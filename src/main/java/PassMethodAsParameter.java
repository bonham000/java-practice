import java.util.ArrayList;
import java.util.Random;

interface F<A, B> {
    public B f(A e);
}

public class PassMethodAsParameter {

    // Initialize some array data to use
    private ArrayList<Integer> data = new ArrayList<Integer>() {{
        Integer count = 0;
        while (count < 500) {
            add(new Random().nextInt(100));
            count++;
        }
    }};

    // Main solution: run test method against elements in array
    private Integer findElementInArray(ArrayList<Integer> array, F<Integer, Boolean> fn) {
        Integer found = null;
        for (Integer i:array) {
            System.out.println(i);
            if (found == null && fn.f(i)) {
                found = i;
                break;
            }
        }
        return found;
    }

    // Create test method and call helper function to with (array, testMethod) to determine answer
    public Integer run() {

        F<Integer, Boolean> testMethodUsingLambda = e -> e % 3 == 0;

        F<Integer, Boolean> testMethod = new F<Integer, Boolean>() {
            public Boolean f(Integer e) {
                return (e % 3 == 0);
            }
        };

        return findElementInArray(data, testMethod);

    }

}
