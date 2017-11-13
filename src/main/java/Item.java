public class Item implements ItemInterface {

    private String value;
    private Integer priority;

    private Item next;
    private Item prev;

    public Item(String value, Integer priority) {
        this.value = value;
        this.priority = priority;
    }

    public void setNext(Item next) {
        this.next = next;
    }

    public void setPrev(Item prev) {
        this.prev = prev;
    }

    public Item getNext() {
        return next;
    }

    public Item getPrev() {
        return prev;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public Integer getPriority() {
        return this.priority;
    }
}
