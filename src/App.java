import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        // QuickSortArrayTest();
         QuickSortLinkedListTest();
        //linkedListTest();
        /*
         * LinkedList list = new LinkedList();
         * 
         * list.addAtEnd(new Node(2, null));
         * 
         * list.addAtEnd(new Node(5, null));
         * 
         * list.addAtEnd(new Node(5, null));
         * list.addAtEnd(new Node(4, null));
         * 
         * list.addAtEnd(new Node(5, null));
         * list.addAtEnd(new Node(1, null));
         * list.addAtEnd(new Node(1, null));
         * 
         * list.addAtEnd(new Node(1, null));
         * list.addAtEnd(new Node(1, null));
         * list.addAtEnd(new Node(1, null));
         * 
         * PrintLinkedList(list, "Original");
         * 
         * LinkedList lesser = new LinkedList();
         * LinkedList greater = new LinkedList();
         * 
         * Node pivot = list.removeCurrentFirst();
         * 
         * Node current = null;
         * 
         * while (list.head != null) {
         * 
         * current = list.removeCurrentFirst();
         * if (current.getItem() < pivot.getItem()) {
         * lesser.addAtEnd(current);
         * } else {
         * greater.addAtEnd(current);
         * }
         * }
         * 
         * lesser = LinkedListSort(lesser);
         * 
         * lesser.addAtEnd(pivot);
         * greater = LinkedListSort(greater);
         * lesser.appendList(greater);
         * 
         * PrintLinkedList(lesser, "Sorted First Degree");
         */

    }

    public static void linkedListTest() {
        Random rnd = new Random();
        LinkedList list = new LinkedList();

        LinkedList list2 = new LinkedList();

        LinkedList list3 = new LinkedList();
        int lengthOfList = 10;
        for (int i = 0; i < lengthOfList; i++) {
            list.addNewNode(i);
        }

        PrintLinkedList(list2, "Before");
        list2.addNewNode(12);
        PrintLinkedList(list2, "Add new");

        list2.addNewNode(12);
        PrintLinkedList(list2, "Add new 2");

        list3.addNewNode(12);
        list3.addNewNode(12);

        list2.appendList(list);

        PrintLinkedList(list2, "Append");

        list3.prepend(list2);
        PrintLinkedList(list3, "Prepend");

    }

    public static void QuickSortArrayTest() {
        Random rnd = new Random();
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(array.length);
        }

        PrintArray(array);
        QuickArray sortedArray = new QuickArray(array);
        sortedArray.ArraySort(0, sortedArray.array.length - 1);
        PrintArray(sortedArray.array);
    }

    public static void QuickSortLinkedListTest() {
        Random rnd = new Random();
        LinkedList list = new LinkedList();
        int lengthOfList = 10;
        for (int i = 0; i < lengthOfList; i++) {
            list.addNewNode(rnd.nextInt(lengthOfList));
            ;
        }
        PrintLinkedList(list, "Original");
        list.sort();
        PrintLinkedList(list, "Sorted");

    }

    // Linked list works by dividing the list in two, greater than and lesser than
    // the pivot element, We then use quick-sort recursivly on these lists in order
    // to sort them, and then appnends the lesser with the pivot, then the greater
    // one. Can also append sorted lesser with pivot, then this list with greater

    public static void PrintArray(int[] arrayToBePrinted) {
        System.out.println("Array:");
        for (int i = 0; i < arrayToBePrinted.length; i++) {
            System.out.println("Position " + (i + 1) + "| Value: " + arrayToBePrinted[i]);
        }

        System.out.println();
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
