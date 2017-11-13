public class PriorityQueueClass {

    private Item head;
    private Item tail;
    private Integer size;

    public PriorityQueueClass() {
        this.head = null;
        this.size = 0;
    }

    public Integer getSize() {
        return this.size;
    }

    private void enqueue(Item item) {
        if (this.head == null) {
            this.head = item;
            this.tail = item;
        } else {
            Item current = this.tail;
            Boolean inserted = false;
            while (!inserted) {
                if (item.getPriority() <= current.getPriority()) {
                  current.setNext(item);
                  item.setPrev(current);
                  this.tail = item;
                  inserted = true;
                } else if (item.getPriority() > current.getPriority()) {
                    if (current == this.head) {
                        this.head = item;
                        item.setNext(current);
                        current.setPrev(item);
                        inserted = true;
                    } else {
                        current = current.getPrev();
                    }
                } else {
                    Item next = current.getNext();
                    current.setNext(item);
                    item.setPrev(current);
                    item.setNext(next);
                    next.setPrev(item);
                    inserted = true;
                }
            }
        }
        this.size++;
    }

    public void add(String value, Integer priority) {
        Item item = new Item(value, priority);
        enqueue(item);
    }

    public void add(String value) {
        Item item = new Item(value, 0);
        enqueue(item);
    }

    public Item remove() {
        Item removed = this.head;
        this.head = removed.getNext();
        this.head.setPrev(null);
        return removed;
    }

}
