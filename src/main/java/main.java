import java.util.Random;

public class main {
    private static long limit = 15;
    public static void main(String[] args) {
        System.out.println("Starting...");

        LinkedList list = new LinkedList();

        Random rand = new Random();
        rand.ints(limit).forEach(n -> list.append(n));
        list.readList();
    }
}
