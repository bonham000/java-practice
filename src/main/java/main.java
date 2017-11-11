import java.util.Random;

public class main {

    public static void main(String[] args) {
        System.out.println("I love Java...");

        Tree t = new Tree();

        long current = 0;
        while (current < 15) {
            t.addValue((Integer) new Random().nextInt(10));
            current++;
        }

        System.out.println("Is it a binary tree? " + t.isBinaryTree());

        System.out.println(t.traverse("Preorder"));
        System.out.println(t.traverse("Inorder"));
        System.out.println(t.traverse("PostOrder"));

        System.out.println(t.levelOrder());

    }
}
