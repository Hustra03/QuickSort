public class LinkedList {

    Node first;
    Node last;

    LinkedList() {
        this.first = null;
        this.last = null;
    }

    public Node getFirst() {
        return this.first;
    }

    public void addNewNode(int value) {
        Node item = new Node(value, first);
        if (this.last == null) {
            this.last = item;
        }
        item.next = this.first;
        this.first = item;

    }

    public void add(Node item) {

        if (this.last == null) {
            this.last = item;
        }
        item.setNextNode(this.first);
        this.first = item;

    }

    public void appendList(LinkedList b) {
        if (b != null) {

            if (this.last == null) {
                this.first = b.first;
                this.last=b.last;
            } else {
                this.last.setNextNode(b.first);
            }

            this.last = b.last;
        }
        b.first = null;
        b.last = null;
    }

    public void prepend(LinkedList b) {
        if (b != null) {
            if (b.last != null) {
                b.last.setNextNode(this.first);
            }
            if (this.last == null) {
                this.last = b.last;
            }
            if (b.first != null) {
                this.first = b.first;
            }
            b.first = null;
            b.last = null;
        }
    }

    public void sort() {
        if (this.first == null || this.first.next == null) {
            return;
        }
        LinkedList smaller = new LinkedList();
        LinkedList larger = new LinkedList();

        Node pivot = this.first;

        Node cur = pivot.next;

        pivot.setNextNode(null);

        this.last = pivot;

        int p = pivot.item;

        while (cur != null) {
            Node nxt = cur.next;
            if (p > cur.getItem()) {
                smaller.add(cur);
            } else {
                larger.add(cur);
            }
            cur = nxt;
        }

        smaller.sort();
        larger.sort();

        this.prepend(smaller);
        this.appendList(larger);
    }

}
