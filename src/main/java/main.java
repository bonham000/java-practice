public class main {

    public static void main(String[] args) {
        System.out.println("I love Java...");

        Tree t = new Tree(15);
        t.addValue(10);
        t.addValue(1);
        t.addValue(3);
        t.addValue(17);
        System.out.println(t.size());
        System.out.println(t.isBinaryTree());

        System.out.println(t.getDescription());

    }
}
