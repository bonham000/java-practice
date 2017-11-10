import java.util.ArrayList;

public class Tree implements TreeInterface {

    private TreeNode root;
    private long size;
    private ArrayList<Integer> result;

    public Tree(Integer value) {
        this.root = new TreeNode(value);
        this.size++;
        this.result = new ArrayList<>();
    }

    public Tree() {
        this.root = null;
        this.size = 0;
        this.result = new ArrayList<>();
    }

    public String getDescription() {
        return this.description;
    }

    private void recursePreOrder(TreeNode node) {
        this.result.add(node.getValue());
        if (node.getLeft() != null) recursePreOrder(node.getLeft());
        if (node.getRight() != null) recursePreOrder(node.getRight());
    }

    private void recurseInOrder(TreeNode node) {
        if (node.getLeft() != null) recurseInOrder(node.getLeft());
        this.result.add(node.getValue());
        if (node.getRight() != null) recurseInOrder(node.getRight());
    }

    private void recursePostOrder(TreeNode node) {
        if (node.getLeft() != null) recursePostOrder(node.getLeft());
        if (node.getRight() != null) recursePostOrder(node.getRight());
        this.result.add(node.getValue());
    }

    public ArrayList<Integer> traverse(String type) {
        this.result = new ArrayList<>();

        switch(type.toUpperCase()) {
            case "PREORDER": recursePreOrder(this.root); break;
            case "INORDER": recurseInOrder(this.root); break;
            case "POSTORDER": recursePostOrder(this.root); break;
        };

        System.out.println("Returning: " + type.toUpperCase() + " Tree Traversal —");
        return this.result;
    }

    public boolean isBinaryTree() {
        return isBinaryTree(this.root, true);
    }

    private boolean isBinaryTree(TreeNode node, boolean flag) {
        if (node.getLeft() != null) {
            if (node.getLeft().getValue() > node.getValue()) {
                flag = false;
            } else {
                return isBinaryTree(node.getLeft(), flag);
            }
        }

        if (node.getRight() != null) {
            if (node.getRight().getValue() < node.getValue()) {
                flag = false;
            } else {
                isBinaryTree(node.getRight(), flag);
            }
        }

        return flag;

    }

    private boolean findAndAdd(TreeNode node, Integer value) {
        if (value < node.getValue()) {
            if (node.getLeft() != null) {
                return findAndAdd(node.getLeft(), value);
            } else {
                node.setLeft(new TreeNode(value));
                this.size++;
                return true;
            }
        } else if (value > node.getValue()) {
            if (node.getRight() != null) {
                return findAndAdd(node.getRight(), value);
            } else {
                node.setRight(new TreeNode(value));
                this.size++;
                return true;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean addValue(Integer value) {
        if (this.root == null) {
            this.root = new TreeNode(value);
            this.size++;
            return true;
        } else {
            TreeNode current = this.root;
            return findAndAdd(current, value);
        }
    }

    @Override
    public boolean removeValue(Integer value) {
        return false;
    }

    @Override
    public boolean containsValue(Integer value) {
        return false;
    }

    @Override
    public long size() {
        return this.size;
    }
}
