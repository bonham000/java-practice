public class Tree implements TreeInterface {

    private TreeNode root;
    private long size;

    public Tree(Integer value) {
        this.root = new TreeNode(value);
        this.size++;
    }

    public Tree() {
        this.root = null;
        this.size = 0;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isBinaryTree() {
        return isBinaryTree(this.root);
    }

    private boolean isBinaryTree(TreeNode node) {

        if (node.getLeft() != null) {
            if (node.getLeft().getValue() > node.getValue()) {
                return false;
            } else {
                isBinaryTree(node.getLeft());
            }
        } else {
            return true;
        }

        if (node.getRight() != null) {
            if (node.getRight().getValue() < node.getValue()) {
                return false;
            } else {
                isBinaryTree(node.getRight());
            }
        } else {
            return true;
        }

        return false;

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
