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
        this.first = item;

    }

    public void add(Node item) {

        if (this.last == null) {
            this.last = item;
        }

        item.setNextNode(this.first);
        this.first = item;

    }

    public void appendList(LinkedList b) { // Ensure that this works for every case, aka no,1 and 2, or more than 2
                                           // elements for both this and b
        if ( first == null) {
            this.first = b.first;
            this.last = b.last;

            return;
        }
        if (b != null) {

            if (this.last != null) {
                this.last.setNextNode(b.first);
            }

            this.last = b.last;
        }
        b.first = null;
        b.last = null;
    }

    public void prepend(LinkedList b) {// Ensure that this works for every case, aka no, 1 and 2, or more than 2
                                       // elements for both this and b
        if (this.first == this.last && first == null) {
            this.first = b.first;
            this.last = b.last;
            return;
        }
        if (b != null) {
            if (b.last != null) {
                b.last.setNextNode(this.first);
            }
            if (b.first != null) {
                this.first = b.first;
            }

            b.first = null;
            b.last = null;
        }
    }

    public void sort(int level) {
        if (this.first == null || this.first.next == null) {
            return;
        }

        LinkedList smaller = new LinkedList();
        LinkedList larger = new LinkedList();

        Node pivot = this.first;

        Node cur = pivot.next;

        this.last = null;
        this.first=null;

        pivot.setNextNode(null);

        while (cur != null) {
            Node nxt = cur.next;
            if (pivot.getItem() >= cur.getItem()) {
                smaller.add(cur);
            } else {
                larger.add(cur);
            }
            cur = nxt;
        }

        //PrintLinkedList(this, "Current Pivot :" + level);

        //PrintLinkedList(smaller, "Smaller :" + level);

       // PrintLinkedList(larger, "Larger :" + level);

        larger.sort(level + 1);

        this.appendList(larger);
        
        this.add(pivot);

        smaller.sort(level + 1);

        this.prepend(smaller);

    }

    public static void PrintLinkedList(LinkedList list, String type) {
        System.out.println("List:" + type);
        Node current = list.getFirst();
        int position = 1;
        while (current != null) {
            System.out.println(type + " Position " + (position) + "| Value: " + current.getItem());
            position++;
            current = current.getNext();
        }
        System.out.println();
    }

}
