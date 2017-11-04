import java.util.ArrayList;
import java.util.Arrays;

public class LinkedList {

    private int size;
    private Node root;

    public LinkedList() {
        this.size = 0;
        this.root = null;
    }

    public long getSize() {
        return this.size;
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
            System.out.println(i);
            if (current.getNext() != null) {
                current = current.getNext();
            } else {
                current = null;
            }
        }
        results.forEach(val -> {
            System.out.println(val);
        });
    }

}
