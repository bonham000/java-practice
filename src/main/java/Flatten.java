import java.util.ArrayList;
import java.util.Random;

public class Flatten {
    private ArrayList<Integer> testComparison = new ArrayList<Integer>();

    private Integer getRandom() {
        return new Random().nextInt(10);
    }

    private ArrayList<Integer> flatten(ArrayList<Object> nested) {
        return flatten(nested, new ArrayList<Integer>());
    }

    private ArrayList<Integer> flatten(ArrayList<Object> nested, ArrayList<Integer> flattenedArray) {
        for (Object object:nested) {
            if (object instanceof ArrayList<?>) {
                ArrayList<Integer> flattened = flatten((ArrayList<Object>)object);
                flattenedArray.addAll(flattened);
            } else {
                flattenedArray.add((Integer) object);
            }
        }
        return flattenedArray;
    }

    private Object fillArray(Integer currentLimit) {

        Integer pivot = getRandom();

        if (pivot > 5) {
            return generateNestedArray(currentLimit - 1);
        } else {
            Integer entry = getRandom();
            testComparison.add(entry);
            return entry;
        }

    }

    private ArrayList<Object> generateNestedArray(Integer limit) {
        Integer index = 0;
        ArrayList<Object> nested = new ArrayList<Object>();
        while (index <= limit) {
            nested.add(fillArray(limit - 1));
            index++;
        };
        return nested;
    }

    private void arraysEqual(ArrayList<Integer> one, ArrayList<Integer> two) {
        if (one.size() != two.size()) {
            System.out.println("Arrays are not equal!");
            return;
        }

        for (int i = 0; i < one.size(); i++) {
            if (one.get(i) != two.get(i)) {
                System.out.println("Arrays are not equal!");
                return;
            }
        }

        System.out.println("Arrays are equal " + one.size() + " elements compared.");
    }

    public void run() {
        System.out.println("Running Flatten...");
        ArrayList<Object> input = generateNestedArray(20);
        System.out.println(input);
        ArrayList<Integer> flattened = flatten(input);
        System.out.println(flattened);
        arraysEqual(flattened, testComparison);
    }
}
