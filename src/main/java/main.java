import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        System.out.println("Starting...");

        Algorithm a = new Algorithm();
        ArrayList<ArrayList<Integer>> split = a.run(new ArrayList<Integer>() {{
            add(1);
            add(24);
            add(9);
            add(6);
            add(4);
            add(11);
            add(12);
        }}, 1);

        System.out.println(split);

    }
}
