import java.util.ArrayList;

public class Algorithm {

    public ArrayList<ArrayList<Integer>> run(ArrayList<Integer> array, Integer division) {

        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        ArrayList<Integer> segment = new ArrayList<>();

        int measure = 0;
        for (Integer i:array) {

            if (measure < division) {
                segment.add(i);
                measure++;
            }

            if (measure == division) {
                results.add(new ArrayList<>(segment));
                segment.clear();
                measure = 0;
            }
        }

        if (segment.size() > 0) results.add(new ArrayList<>(segment));

        return results;

    }

}