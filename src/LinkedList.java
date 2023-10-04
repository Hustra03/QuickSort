public class LinkedList {

    Node head;
    Node last;

    LinkedList() {
        this.head = null;
        this.last = null;
    }

    public Node getHead() {
        return this.head;
    }

    public void addAtEnd(Node item) {

        item.setNextNode(null); // In order to avoid circular arguments
        if (this.head == null) {
            this.head = item;
        }
        if (this.last == null) {
            this.last = head;
        } else {
            this.last.setNextNode(item);
            this.last = this.last.getNext();
        }

    }

    public Node removeCurrentFirst() {
        Node temp = this.head;
        if (this.head != null) {
            this.head = head.getNext();
            if (this.head == null) {

                this.last = null;
            }
        }
        if (temp != null) {

            temp.setNextNode(null);
        }
        return temp;
    }

    public void appendList(LinkedList b) {
        if (this.last == null) { // In order to allow appending of an empty list
            this.last = b.head;
        } else {
            this.last.setNextNode(b.head);
        }
        this.last = this.last.getNext();// Updates last to point towards first node of list b
        b.last.setNextNode(null);
    }
}
