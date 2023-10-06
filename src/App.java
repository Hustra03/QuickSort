import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        QuickSortArrayTest();
        // QuickSortLinkedListTest();
        // linkedListAppendTest();
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

    public static void linkedListAppendTest() {
        Random rnd = new Random();
        LinkedList list01 = new LinkedList();
        LinkedList list02 = new LinkedList();
        LinkedList list03 = new LinkedList();
        LinkedList list04 = new LinkedList();

        LinkedList list05 = new LinkedList();
        LinkedList list06 = new LinkedList();
        LinkedList list07 = new LinkedList();
        LinkedList list08 = new LinkedList();

        LinkedList list11 = new LinkedList();
        LinkedList list12 = new LinkedList();
        LinkedList list13 = new LinkedList();
        LinkedList list14 = new LinkedList();

        LinkedList list15 = new LinkedList();
        LinkedList list16 = new LinkedList();
        LinkedList list17 = new LinkedList();
        LinkedList list18 = new LinkedList();

        LinkedList list21 = new LinkedList();
        LinkedList list22 = new LinkedList();
        LinkedList list23 = new LinkedList();
        LinkedList list24 = new LinkedList();

        LinkedList list25 = new LinkedList();
        LinkedList list26 = new LinkedList();
        LinkedList list27 = new LinkedList();
        LinkedList list28 = new LinkedList();

        LinkedList list31 = new LinkedList();
        LinkedList list32 = new LinkedList();
        LinkedList list33 = new LinkedList();
        LinkedList list34 = new LinkedList();

        LinkedList list35 = new LinkedList();
        LinkedList list36 = new LinkedList();
        LinkedList list37 = new LinkedList();
        LinkedList list38 = new LinkedList();

        for (int i = 1; i < 2; i++) {
            list11.addNewNode(i);
            list12.addNewNode(i);
            list13.addNewNode(i);
            list14.addNewNode(i);

            list15.addNewNode(i);
            list16.addNewNode(i);
            list17.addNewNode(i);
            list18.addNewNode(i);
        }

        for (int i = 1; i < 3; i++) {
            list21.addNewNode(i);
            list22.addNewNode(i);
            list23.addNewNode(i);
            list24.addNewNode(i);

            list25.addNewNode(i);
            list26.addNewNode(i);
            list27.addNewNode(i);
            list28.addNewNode(i);
        }

        for (int i = 1; i < 4; i++) {
            list31.addNewNode(i);
            list32.addNewNode(i);
            list33.addNewNode(i);
            list34.addNewNode(i);

            list35.addNewNode(i);
            list36.addNewNode(i);
            list37.addNewNode(i);
            list38.addNewNode(i);
        }

        /*
         * list01.appendList(list05);
         * PrintLinkedList(list01, "0 appended by 0");
         * 
         * list02.appendList(list15);
         * PrintLinkedList(list02, "0 appended by 1");
         * 
         * list03.appendList(list25);
         * PrintLinkedList(list03, "0 appended by 2");
         * 
         * list04.appendList(list35);
         * PrintLinkedList(list04, "0 appended by 3");
         * 
         * 
         * list11.appendList(list06);
         * PrintLinkedList(list11, "1 appended by 0");
         * 
         * list12.appendList(list16);
         * PrintLinkedList(list12, "1 appended by 1");
         * 
         * list13.appendList(list26);
         * PrintLinkedList(list13, "1 appended by 2");
         * 
         * list14.appendList(list36);
         * PrintLinkedList(list14, "1 appended by 3");
         * 
         * 
         * list21.appendList(list07);
         * PrintLinkedList(list21, "2 appended by 0");
         * 
         * list22.appendList(list17);
         * PrintLinkedList(list22, "2 appended by 1");
         * 
         * list23.appendList(list27);
         * PrintLinkedList(list23, "2 appended by 2");
         * 
         * list24.appendList(list37);
         * PrintLinkedList(list24, "2 appended by 3");
         * 
         * list31.appendList(list08);
         * PrintLinkedList(list31, "3 appended by 0");
         * 
         * list32.appendList(list18);
         * PrintLinkedList(list32, "3 appended by 1");
         * 
         * list33.appendList(list28);
         * PrintLinkedList(list33, "3 appended by 2");
         * 
         * list34.appendList(list38);
         * PrintLinkedList(list34, "3 appended by 3");
         */

        list01.prepend(list05);
        PrintLinkedList(list01, "0 prepend by 0");

        list02.prepend(list15);
        PrintLinkedList(list02, "0 prepend by 1");

        list03.prepend(list25);
        PrintLinkedList(list03, "0 prepend by 2");

        list04.prepend(list35);
        PrintLinkedList(list04, "0 prepend by 3");

        list11.prepend(list06);
        PrintLinkedList(list11, "1 prepend by 0");

        list12.prepend(list16);
        PrintLinkedList(list12, "1 prepend by 1");

        list13.prepend(list26);
        PrintLinkedList(list13, "1 prepend by 2");

        list14.prepend(list36);
        PrintLinkedList(list14, "1 prepend by 3");

        list21.prepend(list07);
        PrintLinkedList(list21, "2 prepend by 0");

        list22.prepend(list17);
        PrintLinkedList(list22, "2 prepend by 1");

        list23.prepend(list27);
        PrintLinkedList(list23, "2 prepend by 2");

        list24.prepend(list37);
        PrintLinkedList(list24, "2 prepend by 3");

        list31.prepend(list08);
        PrintLinkedList(list31, "3 prepend by 0");

        list32.prepend(list18);
        PrintLinkedList(list32, "3 prepend by 1");

        list33.prepend(list28);
        PrintLinkedList(list33, "3 prepend by 2");

        list34.prepend(list38);
        PrintLinkedList(list34, "3 prepend by 3");
    }

    public static void QuickSortArrayTest() {
        Random rnd = new Random();
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(array.length);
        }

        PrintArray(array);
        QuickArray sortedArray = new QuickArray(array);
        sortedArray.array = sortedArray.ArraySort(sortedArray.array, 0, sortedArray.array.length - 1);
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
