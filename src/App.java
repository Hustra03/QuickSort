import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        // QuickSortArrayTest();
        QuickSortLinkedListTest();
        // linkedListAppendTest();
        //linkedListAppendTest2();
        /*
         * int lengthsToTest[] = { 128, 256, 512, 1024, 2048, 4096 };
         * for (int i : lengthsToTest) {
         * QuickSortBenchmark(i);
         * System.out.println();
         * }
         */

    }

    public static void linkedListAppendTest() {
        LinkedList list = new LinkedList();

        list.add(new Node(9, null));

        list.add(new Node(1, null));

        list.add(new Node(6, null));

        list.add(new Node(4, null));

        list.add(new Node(7, null));

        list.add(new Node(4, null));

        list.add(new Node(8, null));

        list.add(new Node(1, null));

        list.add(new Node(8, null));

        list.add(new Node(7, null));

        PrintLinkedList(list, "Before");
        list.sort(0);
        PrintLinkedList(list, "After");
    }

    public static void linkedListAppendTest2() throws Exception {

        int numberOfAttempts = 100;
        for (int j = 0; j < numberOfAttempts; j++) {

            Random rnd = new Random();
            LinkedList list = new LinkedList();
            int lengthOfList = 10;
            for (int i = 0; i < lengthOfList; i++) {
                list.addNewNode(rnd.nextInt(lengthOfList));
            }
            Node first = list.first;
            for (int i = 0; i < lengthOfList; i++) {
                if (first == null) {
                    throw new Exception();
                }
                first=first.next;
            }
            list.sort(lengthOfList);
            first = list.first;
            for (int i = 0; i < lengthOfList; i++) {
                if (first == null) {
                    throw new Exception();
                }
                first=first.next;
            }
        }

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
        }
        PrintLinkedList(list, "Original");
        list.sort(0);
        PrintLinkedList(list, "Sorted");

    }

    public static void QuickSortBenchmark(int length) {
        Random rnd = new Random();
        int array[] = new int[length];
        LinkedList list = new LinkedList();

        int numberOfAttempts = 200;

        Long minimumList = Long.MAX_VALUE;

        Long minimumArray = Long.MAX_VALUE;

        System.out.println("Length : " + length + "| Minimum from " + numberOfAttempts + " attempts");

        for (int j = 0; j < numberOfAttempts; j++) {

            for (int i = 0; i < length; i++) {// Creates array and linked list with same random elements
                array[i] = rnd.nextInt(length);
                list.addNewNode(array[i]);
            }

            QuickArray quickArray = new QuickArray(array);

            long t0 = System.nanoTime();

            list.sort(0);

            long t1 = System.nanoTime() - t0;

            if (t1 < minimumList) {
                minimumList = t1;
            }

            t0 = System.nanoTime();

            quickArray.ArraySort(array, 0, length - 1);

            t1 = System.nanoTime() - t0;
            if (t1 < minimumArray) {
                minimumArray = t1;
            }

        }
        System.out.println("List Time : " + minimumList + " ns");
        System.out.println("Array Time: " + minimumArray + " ns");

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
