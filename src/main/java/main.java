
public class main {
    public static void main(String[] args) {
        System.out.println("Starting...");
        long[] arguments1 = new long[] {5, 15, 17, 10};
        long[] arguments2 = new long[] {15, 17};
        long[] result = DiffArrays.diffArrays(arguments1, arguments2);
        System.out.println("Showing result:");
        for (long e:result) System.out.println(e);

    }
}
