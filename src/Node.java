public class Node {

    Integer item;
    Node next;

    public Node(Integer item, Node nextNode) {
        this.item = item;
        this.next = nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.next = nextNode;
    }

    public Node getNext() {
        return this.next;
    }

    public Integer getItem() {
        return this.item;
    }

}
