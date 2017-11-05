import java.util.HashSet;
import java.util.Set;

public class DoublyLinkedList {

    public static final String name = "Doubly Linked List";

    private int size;
    private Node head;
    private Node tail;
    private Set<Integer> values;

    public int getSize() {
        return this.size;
    }

    public DoublyLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
        this.values = new HashSet<Integer>();
        System.out.println("Doubly Linked List initialized.");
    }

    public boolean isOrdered(Node node) {
        if (node == null) {
            node = this.head;
        }
        Node nextNode = node.getNext();
        if (nextNode == null) return true;
        Long currentValue = node.getValue();
        Long nextValue = nextNode.getValue();

        if (currentValue < nextValue) {
            return isOrdered(nextNode);
        } else {
            return false;
        }
    }

    public boolean remove(Integer value) {
        if (!this.values.contains(value)) return false;
        Node current = this.head;
        while (current.getNext() != null) {
            if (current.getValue() == value) {
                Node prevNode = current.getPrev();
                Node nextNode = current.getNext();
                prevNode.setNext(nextNode);
                nextNode.setPrev(prevNode);
                this.values.remove(value);
                this.size--;
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public boolean append(Integer value) {
        if (this.values.contains(value)) return false;
        this.values.add(value);
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setPrev(current);
        }
        this.size++;
        return true;
    }

}
