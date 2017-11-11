import java.util.ArrayList;

public class LargestNumberArrays {

    private ArrayList<ArrayList<Integer>> sampleArgument = new ArrayList<ArrayList<Integer>>() {{
        add(new ArrayList<Integer>() {{
            add(5);
            add(15);
            add(17);
            add(3);
        }});
        add(new ArrayList<Integer>() {{
            add(51);
            add(32);
            add(19);
            add(-20);
        }});
        add(new ArrayList<Integer>() {{
            add(97);
            add(62);
            add(84);
            add(58);
        }});
    }};

    private Integer getLargestNumber(ArrayList<Integer> numbers) {
        Integer largest = null;
        for (Integer i : numbers) {
            if (largest == null) largest = i;
            if (i > largest) largest = i;
        }
        return largest;
//        return numbers
//            .stream()
//            .reduce((largest, current) -> current > largest ? current : largest)
//            .orElseGet(null);
    }

    public ArrayList<Integer> run(ArrayList<ArrayList<Integer>> lists) {

        System.out.println(lists);

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (ArrayList<Integer> numbers : lists) {
            Integer largestNumber = getLargestNumber(numbers);
            result.add(largestNumber);
        }

        return result;

    }
}
