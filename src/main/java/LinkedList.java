import java.util.ArrayList;

public class LinkedList<S, T> {

    private int size;
    private Node root;

    public LinkedList() {
        this.size = 0;
        this.root = null;
    }

    public long getSize() {
        return this.size;
    }

    public boolean hasValue(long value, Node current) {
        if (current == null) current = this.root;
        if (current.getValue() == value) return true;
        if (current.getNext() != null) {
            return hasValue(value, current.getNext());
        } else {
            return false;
        }
    }

    public void append(long value) {
        Node newNode = new Node(value);
        if (this.root == null) {
            this.root = newNode;
        } else {
            Node current = this.root;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        this.size++;
    }

    public void readList() {
        ArrayList<Integer> results = new ArrayList<>();
        Node current = this.root;
        while (current != null) {
            Integer i = (int) (long) current.getValue();
            results.add(i);
            if (current.getNext() != null) {
                current = current.getNext();
            } else {
                current = null;
            }
        }
        results.forEach(val -> System.out.println(val));
    }

}
