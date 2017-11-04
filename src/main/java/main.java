public class main {
    public static void main(String[] args) {
        System.out.println("HELLO!");

        Counter c = new Counter(60);
        int value = c.getCount();

        System.out.println(value);
    }
}
