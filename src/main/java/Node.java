public class Node {

    private long value;
    private Node next;
    private Node prev;

    public Node(long value) {
        this.value = value;
        this.next = null;
        this.prev= null;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }

    public void setPrev(Node prevNode) {
        this.prev = prevNode;
    }

    public Node getNext() {
        return this.next;
    }

    public Node getPrev() {
        return this.prev;
    }

}
